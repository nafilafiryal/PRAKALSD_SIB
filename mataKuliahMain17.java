public class mataKuliahMain17 {
    public static void main(String[] args) {
        mataKuliah17 mk1 = new mataKuliah17();
        mk1.kodeMK = "SIB242004";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        mk1.kurangiJam(7);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        mataKuliah17 mk2 = new mataKuliah17();
        mk2.kodeMK = "SIB242005";
        mk2.nama = "Praktikum Algoritma dan Struktur Data";
        mk2.sks = 2;
        mk2.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        mk1.kurangiJam(8);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();
    }
}
