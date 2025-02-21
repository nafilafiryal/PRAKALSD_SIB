import java.util.Scanner;

public class jobsheet1TugasNo2 {
    Scanner input = new Scanner(System.in);
    static void volumeKubus() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = input.nextDouble();
        double volumKub = sisiKubus * sisiKubus * sisiKubus;
        System.out.println("Volume Kubus dengan panjang sisi kubus " + sisiKubus + " adalah: " + volumKub);
        System.out.println("==================");
    }
    static void luasPermKub() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = input.nextDouble();
        double luasPermukaanKubus = 6 * (sisiKubus * sisiKubus);
        System.out.println("Luas Permukaan Kubus dengan panjang sisi kubus " + sisiKubus + " adalah: " + luasPermukaanKubus);
        System.out.println("==================");
    }
    static void kelilingKubus() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = input.nextDouble();
        double kelKubus = 12 * sisiKubus;
        System.out.println("Keliling Kubus dengan panjang sisi kubus " + sisiKubus + " adalah: " + kelKubus);
        System.out.println("==================");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("      KUBUS");
        System.out.println("==================");
        System.out.println("Menu: ");
        System.out.println("1. Menghitung volume kubus.");
        System.out.println("2. Menghitung luas permukaan kubus.");
        System.out.println("3. Menghitung keliling bus.");
        System.out.print("Menu yang anda pilih: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                volumeKubus();
                break;
            case 2:
                luasPermKub();
                break;
            case 3:
                kelilingKubus();
                break;
        }
    }
}
