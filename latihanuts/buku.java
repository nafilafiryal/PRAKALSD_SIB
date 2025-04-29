public class buku {
    String kodeBuku;
    String judulBuku;
    String penulis;
    boolean statusPeminjaman;

    public buku(String kodeBuku, String judulBuku, String penulis){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.statusPeminjaman = false;
    }
    void pinjam(){
        statusPeminjaman = true;
    }
    void kembalikan(){
        statusPeminjaman = false;
    }
    boolean isDiPinjam(){
        return statusPeminjaman;
    }
    public String toString(){
        return judulBuku + (statusPeminjaman ? " (Dipinjam)" : " (Tersedia)");
    }
}
