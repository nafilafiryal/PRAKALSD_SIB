import java.util.Scanner;

public class jobsheet1Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilTug = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilKuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        double nilUts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        double nilUas = input.nextInt();
        System.out.println("======================");
        System.out.println("======================");

        if (nilTug >100 || nilKuis >100 || nilUts >100 || nilUas >100) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else {
            double nilAkhir = (0.2 *nilTug) + (0.2 * nilKuis) + (0.3 * nilUts) + (0.4 * nilUas);
            System.out.println("nilai akhir : " + nilAkhir);

            if (nilAkhir >80 || nilAkhir <= 100) {
                System.out.println("Nilai Huruf :A");
                System.out.println("======================");
                System.out.println("======================");
            } else if (nilAkhir >73 || nilAkhir <=80) {
                System.out.println("Nilai Huruf :B+");
                System.out.println("======================");
                System.out.println("======================");
            } else if (nilAkhir >65 || nilAkhir <= 73) {
                System.out.println("Nilai Huruf :B");
                System.out.println("======================");
                System.out.println("======================");
            } else if (nilAkhir >60 || nilAkhir <= 65) {
                System.out.println("Nilai Huruf :C+");
                System.out.println("======================");
                System.out.println("======================");
            } else if (nilAkhir >50 || nilAkhir <= 60) {
                System.out.println("Nilai Huruf :C");
                System.out.println("======================");
                System.out.println("======================");
            } else if (nilAkhir >39 || nilAkhir <= 50) {
                System.out.println("Nilai Huruf :D");
                System.out.println("======================");
                System.out.println("======================");
            } else {
                System.out.println("Nilai Huruf :E");
                System.out.println("======================");
                System.out.println("======================");
            }
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}