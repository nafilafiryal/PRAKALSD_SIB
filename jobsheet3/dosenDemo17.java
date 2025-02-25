import java.util.Scanner;
public class dosenDemo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen yang ingin diinput: ");
        int datDos = input.nextInt();
        dosen17[] arrayOfDosen = new dosen17[datDos];

        for (int i = 0; i < datDos; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = input.next();
            input.nextLine();
            System.out.print("Nama: ");
            String nama = input.next();
            input.nextLine();
            System.out.print("Jenis Kelamin (true: Laki-laki, false: Perempuan): ");
            boolean jenisKelamin = input.nextBoolean();
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("----------------------------------------------------------");
            arrayOfDosen[i] = new dosen17(kode, nama, jenisKelamin, usia);
        }
            dataDosen17.dataSemuaDosen(arrayOfDosen);
            dataDosen17.jumlahDosenPerJenisKelamin(arrayOfDosen);
            dataDosen17.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
            dataDosen17.infoDosenPalingTua(arrayOfDosen);
            dataDosen17.infoDosenPalingMuda(arrayOfDosen);

    }
}
