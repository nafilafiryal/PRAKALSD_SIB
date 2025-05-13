package Tugas;

public class mahasiswa {
    String nim, nama, kelas;
    double ipk;
    mahasiswa next;

    public mahasiswa(){
    }

    public mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.next = null;
    }

    public void tampilInformasi(){
        System.out.printf("%-10s %-10s %-5s %-5.1f\n", nama, nim, kelas, ipk);
    }
}
