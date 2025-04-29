import java.util.Scanner;

public class mahasiswaArrayDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswa[] arrayOfMahasiswa = new mahasiswa[3];
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK     : ");
            String dummy = input.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Data Mahasiswa ke-" + (j + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa[j].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[j].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[j].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[j].ipk);
            System.out.println();

        }
    }
}
