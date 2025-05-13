public class Mahasiswa17 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa17(){
    }
    public Mahasiswa17(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    public void tampilInformasi(){
        System.out.printf("%-10s %-10s %-5s %-5.1f\n", nama, nim, kelas, ipk);
    }
}
