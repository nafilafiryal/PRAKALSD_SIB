public class Mahasiswa17 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa17(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai =-1;
    }
    Mahasiswa17(){

    }
    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
