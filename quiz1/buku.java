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
    public String kodeBuku(){
        return kodeBuku;
    }
    public String judulBuku(){
        return judulBuku;
    }
    public String penulis(){
        return penulis;
    }
    public boolean statusPeminjaman(){
        return statusPeminjaman;
    }
    void statusPeminjaman(boolean status){
        this.statusPeminjaman = status;
    }
    void tampilkanInfo(){
        System.out.println(kodeBuku + " | " + judulBuku + " | " + penulis + " | " + (statusPeminjaman? "Dipinjam" : "Tersedia"));
    }
}
