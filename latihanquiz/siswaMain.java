public class siswaMain {
    public static void main(String[] args) {
        siswa siswa1 = new siswa();
        siswa1.nama = "Nafila";
        siswa1.usia = 19;
        siswa1.nilaiRataRata = 94;
        siswa1.tampilkanInformasi();
        siswa1.cekLulus();

        siswa siswa2 = new siswa("Firyal", 19, 94);
        siswa2.tampilkanInformasi();
        siswa2.cekLulus();
    }
}