import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();
        Mahasiswa17 mhs1 = new Mahasiswa17("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa17 mhs3 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);
        Mahasiswa17 mhs2 = new Mahasiswa17("22212202", "Cintia", "3C", 3.5);
        Mahasiswa17 mhs4 = new Mahasiswa17("21212203", "Dirga", "4D", 3.6);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        // sll.remove("bimon");
        // sll.print();
        // int pilihan;

        // do {
        //      System.out.println("\nMENU:");
        //     System.out.println("1. Tambah di Awal");
        //     System.out.println("2. Tambah di Akhir");
        //     System.out.println("3. Sisipkan Setelah Nama");
        //     System.out.println("4. Tampilkan Data");
        //     System.out.println("5. Keluar");
        //     System.out.print("Pilih opsi: ");
        //     pilihan = sc.nextInt();
        //     sc.nextLine();

        //     if (pilihan == 1 || pilihan == 2 || pilihan == 3) {
        //         System.out.print("Masukkan NIM: ");
        //         String nim = sc.nextLine();
        //         System.out.print("Masukkan Nama: ");
        //         String nama = sc.nextLine();
        //         System.out.print("Masukkan Kelas: ");
        //         String kelas = sc.nextLine();
        //         System.out.print("Masukkan IPK: ");
        //         double ipk = sc.nextDouble();
        //         sc.nextLine();

        //         Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);

        //         switch (pilihan) {
        //             case 1:
        //                 sll.addFirst(mhs);
        //                 break;
        //             case 2:
        //                 sll.addLast(mhs);
        //                 break;
        //             case 3:
        //                 System.out.print("Masukkan Nama Setelah Siapa? ");
        //                 String key = sc.nextLine();
        //                 sll.insertAfter(key, mhs);
        //                 break;
        //         }
        //     } else if (pilihan == 4) {
        //         sll.print();
        //     }
        // } while (pilihan != 5);
        // sc.close();
    }
}
