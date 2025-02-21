import java.util.Scanner;

public class jobsheet1TugasNo3 {
    public static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        System.out.printf("%-20s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-20s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
        }
    }
    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hari.toUpperCase() + " ===");
        System.out.printf("%-20s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-20s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
    }
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + sem + " ===");
        System.out.printf("%-20s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == sem) {
                System.out.printf("%-20s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + sem);
        }
    }
    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String cariNama) {
        System.out.println("\n=== HASIL PENCARIAN ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(cariNama)) {
                System.out.printf("%-20s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
                System.out.printf("%-20s %-5d %-10d %-10s\n",namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata Kuliah dengan nama '" + cariNama + "' tidak ditemukan.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = input.next();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin ditampilkan (contoh: Senin): ");
                    String hari = input.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = input.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String cariNama = input.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, cariNama);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
