public class dosen17 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        this.statusAktif = status;
    } 
    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;

    }
    void ubahKeahlian(String bidang){
        this.bidangKeahlian = bidang;
    }
}

