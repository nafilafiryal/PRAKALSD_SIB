import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang diinput: ");
        int jumMhs = input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i+1));
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = input.nextLine();
            System.out.print("Masukkan IPK: ");
            String ip = input.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------------");
            list.tambah(new Mahasiswa17(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("---------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();
        System.out.println("---------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);


        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.SelectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        // list.insertionSortDesc();
        // list.tampil();
    }
}
