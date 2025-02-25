import java.util.Scanner;
public class mataKuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;
        
        System.out.print("Banyaknya Data Matakuliah yang akan diinputkan: ");
        int datMatkul = sc.nextInt();
        mataKuliah17[] arrayOfMataKuliah = new mataKuliah17[datMatkul];
        
        for (int j = 0; j < datMatkul; j++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (j+1));
            arrayOfMataKuliah[j] = new mataKuliah17(); 
            arrayOfMataKuliah[j].tambahData();
            }

        for (int i = 0; i < datMatkul; i++) {
            arrayOfMataKuliah[i].cetakInfo(arrayOfMataKuliah);
        }
    }
}
