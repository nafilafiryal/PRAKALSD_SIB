import java.util.Scanner;

public class mataKuliahArrayDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mataKuliahArray[] arrayOfMataKuliah = new mataKuliahArray[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = input.nextLine();
            System.out.print("Nama      : ");
            nama = input.nextLine();
            System.out.print("SKS       : ");
            dummy = input.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam  : ");
            dummy = input.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println();

            arrayOfMataKuliah[i] = new mataKuliahArray(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
        }
    }
}
