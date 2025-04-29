import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);
    static perpustakaan perpustakaan = new perpustakaan();
    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:tambahBuku();
                    break;
                case 2:tambahMahasiswa();
                    break;
                case 3:pinjamBuku();
                    break;
                case 4: kembalikanBuku();
                    break;
                case 5: perpustakaan.tampilkanPeminjaman();
                    break;
                case 6 : System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilih != 6);
    }   
    static void tambahBuku(){
        System.out.print("Masukkan kode buku: ");
        String kodeBuku = input.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judulBuku = input.nextLine();
        System.out.print("Masukkan penulis: ");
        String penulis = input.nextLine();

        perpustakaan.tambahBuku(new buku(kodeBuku, judulBuku, penulis));;
    } 
    static void tambahMahasiswa(){
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        perpustakaan.tambahMahasiswa(new mahasiswa(nim, nama));
    }
    static void pinjamBuku(){
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan kode buku: ");
        String kodeBuku = input.nextLine();

        mahasiswa mahasiswa = perpustakaan.cariMahasiswa(nim);
        buku buku = perpustakaan.cariBuku(kodeBuku);

        if (mahasiswa != null && buku != null) {
            mahasiswa.pinjamBuku(buku);
        }
    }
    static void kembalikanBuku(){
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan kode buku: ");
        String kodeBuku = input.nextLine();

        mahasiswa mahasiswa = perpustakaan.cariMahasiswa(nim);
        buku buku = perpustakaan.cariBuku(kodeBuku);

        if (mahasiswa != null && buku != null) {
            mahasiswa.kembalikanBuku(buku);
        }
    }
}
