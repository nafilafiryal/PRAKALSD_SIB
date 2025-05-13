import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();
        int pilihan;

        do {
             System.out.println("\nMENU:");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Sisipkan Setelah Nama");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1 || pilihan == 2 || pilihan == 3) {
                System.out.print("Masukkan NIM: ");
                String nim = sc.nextLine();
                System.out.print("Masukkan Nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("Masukkan IPK: ");
                double ipk = sc.nextDouble();
                sc.nextLine();

                Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);

                switch (pilihan) {
                    case 1:
                        sll.addFirst(mhs);
                        break;
                    case 2:
                        sll.addLast(mhs);
                        break;
                    case 3:
                        System.out.print("Masukkan Nama Setelah Siapa? ");
                        String key = sc.nextLine();
                        sll.insertAfter(key, mhs);
                        break;
                }
            } else if (pilihan == 4) {
                sll.print();
            }
        } while (pilihan != 5);
        sc.close();
    }
}
