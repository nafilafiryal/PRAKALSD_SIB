public class siswa {
    String nama;
    int usia;
    double nilaiRataRata;

    public siswa(){

    }
    public siswa(String nama, int usia, double nilaiRataRata){
        this.nama = nama;
        this.usia = usia;
        this.nilaiRataRata = nilaiRataRata;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Nilai Rata-Rata: " + nilaiRataRata);
    }
    void cekLulus(){
        if (nilaiRataRata > 75) {
            System.out.println(nama + " lulus dengan nilai rata-rata " + nilaiRataRata);
        } else {
            System.out.println(nama + " tidak lulus, nilai rata-rata terlalu rendah.");
        }
    }
    void tambahNilai(double nilai){
        
    }
}