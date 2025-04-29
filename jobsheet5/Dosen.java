public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil(){
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + gender + ", Usia: " + usia);
    }
}
