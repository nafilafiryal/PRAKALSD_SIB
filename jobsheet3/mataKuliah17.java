import java.util.Scanner;

public class mataKuliah17 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public String dummy;
    public int sks;
    public int jumlahJam;

    public mataKuliah17() {
    }

    public mataKuliah17(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(){
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("Sks       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy=sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");
    }

    public static void cetakInfo(mataKuliah17[] arrayOfMataKuliah) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
            System.out.println("Sks         : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("----------------------------------");
        }
    }
}
