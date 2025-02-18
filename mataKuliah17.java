public class mataKuliah17 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("SKS telah diubah");
    }
    int tambahJam(int jam){
        this.jumlahJam += jam;
        return this.jumlahJam;
    }
    void kurangiJam(int jam){
        if (this.jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam awal tidak mencukupi.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam mata kuliah setelah dikurangi: " + this.jumlahJam);
        }
    }
}
