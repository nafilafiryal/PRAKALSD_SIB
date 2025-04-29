//17_Nafilah Firyal Hana
//SIB-1G
import java.util.Scanner;

public class main {
    static barang[] arrayOfBarang = new barang[100];
    static penjualanBarang[] arrayOfPenjualan = new penjualanBarang[100];
    static int jumlahBarang = 0;
    static int jumlahPenjualan = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            tampilkanMenu();
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    inputBarang();
                    break;
                case 2:
                    penjualanBarang();
                    break;
                case 3:
                    urutkanBarang();
                    break;
                case 4:
                    barangTerlaris();
                    break;
                case 5:
                    tampilkanBarang();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 0);

    }
    static void tampilkanMenu(){
       System.out.println("1. Input Barang");
       System.out.println("2. Penjualan Barang");
       System.out.println("3. Cek Stok Barang Terbanyak");
       System.out.println("4. Cek Stok Barang Terlaris");
       System.out.println("5. Tampil Barang"); 
       System.out.println("Masukkan angka menu yang ingin dipilih:");
    }
    static void inputBarang(){
        String ulang;
        do {
            System.out.println("Input Data Barang");
            System.out.print("Kode    = ");
            String kode = input.nextLine();
            System.out.print("Nama    = ");
            String namaBarang = input.nextLine();
            System.out.print("Stok    = ");
            int stok = input.nextInt();
            System.out.print("Harga   = ");
            int harga = input.nextInt();
            input.nextLine();

            barang barang = new barang(kode, namaBarang, stok, harga);
            arrayOfBarang[jumlahBarang++] = barang;
            System.out.println("Barang berhasil ditambahkan!");

            System.out.println("Apakah anda ingin mengulang? Y / T ");
            ulang = input.nextLine();
        } while (ulang.equalsIgnoreCase("Y"));
    }
    static void penjualanBarang(){
        String ulang;
        do {
            System.out.println("Data barang yang ada");
            tampilkanBarang();

            System.out.print("Masukkan kode barang yang akan dibeli = ");
            String kode = input.nextLine();
            System.out.print("Masukkan jumlah barang yang dibeli = ");
            int jumlah = input.nextInt();
            input.nextLine();

            barang barang = cariBarang(kode);
            if (barang != null) {
                if (barang.stok >= jumlah) {
                    penjualanBarang penjualanBarang = new penjualanBarang(barang, jumlah);
                    arrayOfPenjualan[jumlahPenjualan++] = penjualanBarang;
                    barang.stok -= jumlah;
                    System.out.println("Barang berhasil dibeli!");
                } else {
                    System.out.println("Stok barang tidak mencukupi.");
                }
            } else {
                System.out.println("Barang tidak ditemukan.");
            }
            System.out.print("Apakag anda ingin menambahkan Barang yang dibeli? Y / T ");
            ulang = input.nextLine();

        } while (ulang.equalsIgnoreCase("Y"));
        tampilkanPenjualan();
    }
    static barang cariBarang(String kode){
        for (int i = 0; i < jumlahBarang; i++) {
            if (arrayOfBarang[i].kode.equalsIgnoreCase(kode)) {
                return arrayOfBarang[i];
            }
        }
        return null;
    }
    static void tampilkanPenjualan(){
        int totalBayar = 0;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Kode    |   Nama            |   Jumlah  |   Harga   | Total Harga");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < jumlahPenjualan; i++) {
            int totalHarga = arrayOfPenjualan[i].jumlah * arrayOfPenjualan[i].barang.hargaSatuan;
            System.out.printf("%-4s |   %-16s   |   %-6d    |   %-5d    |   %-11d\n", arrayOfPenjualan[i].barang.kode, arrayOfPenjualan[i].barang.namaBarang, arrayOfPenjualan[i].jumlah, arrayOfPenjualan[i].barang.hargaSatuan, totalHarga);
            totalBayar += totalHarga;
            System.out.println("---------------------------------------------------------------------------");
        }
        System.out.println("total bayar adalah = " + totalBayar);
    }
    static void urutkanBarang(){
        for (int i = 0; i < jumlahBarang - 1; i++) {
            int maxStok = i;
            for (int j = i + 1; j < jumlahBarang; j++) {
                if (arrayOfBarang[j].stok > arrayOfBarang[maxStok].stok) {
                    maxStok = j;
                }
            }
            barang temp = arrayOfBarang[i];
            arrayOfBarang[i] = arrayOfBarang[maxStok];
            arrayOfBarang[maxStok] = temp;
        }
        System.out.println("Berikut ini adalah List Daftar Barang dengan stok terbanyak ke sedikit");
        tampilkanBarang();
    }
    static void barangTerlaris(){
        barang barangTerlaris = null;
        int maxJumlah = 0;

        for (int i = 0; i < jumlahPenjualan; i++) {
            if (arrayOfPenjualan[i].jumlah > maxJumlah) {
                maxJumlah = arrayOfPenjualan[i].jumlah;
                barangTerlaris = arrayOfPenjualan[i].barang;
            }
        }
        if (barangTerlaris != null) {
            System.out.println("Barang terlaris adalah " + barangTerlaris.namaBarang + " dengan jumlah penjualan adalah " + maxJumlah);
        } else {
            System.out.println("Belum ada penjualan.");
        }
    }
    static void tampilkanBarang(){
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Kode    |   Nama            | Stok  |   Harga");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("%-4s |   %-16s   |   %-4d    |   %-5d\n", arrayOfBarang[i].kode, arrayOfBarang[i].namaBarang, arrayOfBarang[i].stok, arrayOfBarang[i].hargaSatuan);
            System.out.println("-------------------------------------------------------------------------------------");

        }
    }
}
// halooo
// Haii wkwk
//okeee
// belajar React
