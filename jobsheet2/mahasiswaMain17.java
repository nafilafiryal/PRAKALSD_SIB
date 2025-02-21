import java.util.Scanner;
public class mahasiswaMain17 {
    public static void main(String[] args) {
        mahasiswa17 mhs1 = new mahasiswa17();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa17 mhs2 = new mahasiswa17("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa17 mhsNafilah = new mahasiswa17("Nafilah Firyal Hana", "244107060047", 4.0, "SIB 1G");
        mhsNafilah.tampilkanInformasi();
    }
}
