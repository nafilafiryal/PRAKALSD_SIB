import java.util.Scanner;

public class jobsheet1Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nilHuruf = new String[8];
        double[] nilSetara = new double[8];
        double[] angkaMk = new double[8];
        String[] matKul = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", 
            "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        System.out.println("===========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===========================");
        for (int i = 0; i < 8; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + matKul[i] + ": ");
            angkaMk[i] = input.nextDouble();
        }
        System.out.println("===========================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("===========================");

        for (int i = 0; i < 8; i++) {
            if (angkaMk[i] > 80 && angkaMk[i] <= 100) {
                nilHuruf[i] = "A";
                nilSetara[i] = 4;
            } else if (angkaMk[i] > 73 && angkaMk[i] <= 80) {
                nilHuruf[i] = "B+";
                nilSetara[i] = 3.5;
            } else if (angkaMk[i] > 65 && angkaMk[i] <= 73) {
                nilHuruf[i] = "B";
                nilSetara[i] = 3;
            } else if (angkaMk[i] > 60 && angkaMk[i] <= 65) {
                nilHuruf[i] = "C+";
                nilSetara[i] = 2.5;
            } else if (angkaMk[i] > 50 && angkaMk[i] <= 60) {
                nilHuruf[i] = "C";
                nilSetara[i] = 2;
            } else if (angkaMk[i] > 39 && angkaMk[i] <= 50) {
                nilHuruf[i] = "D";
                nilSetara[i] = 1;
            } else {
                nilHuruf[i] = "E";
                nilSetara[i] = 0;
            }
        }

        System.out.printf("%-40s %-30s %-30s %-30s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matKul.length; i++) {
            System.out.printf("%-40s %-30s %-30s %-30s\n", matKul[i], angkaMk[i], nilHuruf[i], nilSetara[i]);
        }
        System.out.println("===========================");

        double totalNilaiSetara = 0;
        for (int i = 0; i < matKul.length; i++) {
            totalNilaiSetara += nilSetara[i];
        }
        double IP = totalNilaiSetara / matKul.length;

        System.out.println("IP : " + IP);
    }
}
