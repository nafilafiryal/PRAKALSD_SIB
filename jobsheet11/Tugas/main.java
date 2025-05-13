package Tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        linkedList lilist = new linkedList();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n--- ANTRIAN LAYANAN UNIT KEMAHASISWAAN ---");
            System.out.println("MENU: ");
            System.out.println("1. Cek antrian kosong");
            System.out.println("2. Mengosongkan antrian");
            System.out.println("3. Menambah Antrian");
            System.out.println("4. Memanggil Antrian");
            System.out.println("5. Menampilkan antrian terdepan");
            System.out.println("6. Menampilkan antrian terakhir");
            System.out.println("7. Menampilkan jumlah mahasiswa yang mengantre");
            System.out.println("8. Keluar");
            System.out.print("Masukkan menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    lilist.checkEmptyQueue();
                    break;
                case 2:
                    lilist.clearQueue();
                    break;
                case 3:
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    lilist.enqueue(nama, nim);
                    break;
                case 4: 
                    lilist.dequeue();
                    break;
                case 5:
                    lilist.displayFront();
                    break;
                case 6:
                    lilist.displayRear();
                    break;
                case 7:
                    lilist.queueSize();
                    break;
                case 8:
                    System.out.println("Keluar.");
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 8);
    }
}
