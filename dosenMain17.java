public class dosenMain17 {
    public static void main(String[] args) {
        dosen17 ds1 = new dosen17();
        ds1.idDosen = "12345678910";
        ds1.nama = "Pramana Yoga Saputra, S.Kom., M.MT.";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2018;
        ds1.bidangKeahlian = "Pemrograman";

        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.hitungMasaKerja(2025);
        ds1.ubahKeahlian("Coding");
        ds1.tampilInformasi();
    }
}
