import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen dataDosen = new DataDosen();
        int pilihan;

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("===MENU DATA DOSEN===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Mengurutkan berdasarkan usia dari termuda");
            System.out.println("4. Mengurutkan berdasarkan usia dari tertua");
            System.out.println("5. Cari Dosen berdasarkan Nama");
            System.out.println("6. Cari Dosen berdasarkan Usia");
            System.out.println("7. KELUAR");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan Kode Dosen: ");
                String kode = input.nextLine();
                System.out.print("Masukkan Nama Dosen: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Jenis Kelamin (L/P): ");
                char jkChar = input.next().charAt(0);
                input.nextLine();
                boolean jenisKelamin = (jkChar == 'L' || jkChar == 'l');
                System.out.print("Masukkan Usia: ");
                int usia = input.nextInt();
                input.nextLine();
                dataDosen.tambah(new Dosen(kode, nama, jenisKelamin, usia));
                    break;
                case 2:
                dataDosen.tampil();
                break;
                case 3:
                dataDosen.SortingASC();
                dataDosen.tampil();
                break;
                case 4:
                dataDosen.insertionSort();
                dataDosen.tampil();
                break;
                case 5:
                System.out.print("Masukkan Nama Dosen yang dicari: ");
                String cari = input.nextLine();
                dataDosen.PencarianDataSequential17(cari);
                break;    
                case 6:
                System.out.print("Masukkan Usia Dosen yang dicari: ");
                int usiaCari = input.nextInt();
                int[] posisi = dataDosen.PencarianDataBinary17(usiaCari);
                if (posisi.length == 1 && posisi[0] == -1) {
                    System.out.println("Dosen dengan usia " + usiaCari + " tidak ditemukan.");
                } else {
                    System.out.println("Dosen dengan usia " + usiaCari + " ditemukan.");

                    for (int pos : posisi) {
                        dataDosen.tampilDataSearch(pos);
                        System.out.println("------------------------------------------------");
                    }
                    if (posisi.length > 1) {
                        System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usiaCari + "!");
                    }
                }
                break;
                case 7:
                System.out.println("Terima kasih! Keluar dari program.");
                break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 6);
    }
}
