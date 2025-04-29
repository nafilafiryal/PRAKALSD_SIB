public class mahasiswaMain {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.nama = "NAFILAH FIRYAL HANA";
        mhs1.nim = "244107060047";
        mhs1.kelas = "1G-SIB";
        mhs1.ipk = 4.0;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("1I-SIB");
        mhs1.updateIpk(3.9);
        mhs1.tampilkanInformasi();

        mahasiswa mhs2 = new mahasiswa("NEVITA", "244107060045", 3.9, "1D-TI");
        mhs2.tampilkanInformasi();

    }
}
