public class mahasiswa {
    String nim;
    String nama;
    buku[] bukuDiPinjam;
    int jumlPinjaman;

    public mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
        this.bukuDiPinjam = new buku[2];
        this.jumlPinjaman = 0;
    }
    public String nim(){
        return nim;
    }
    public String nama(){
        return nama;
    }
    public boolean pinjamBuku(buku buku){
        if (jumlPinjaman >= 2) {
            System.out.println(nama + " tidak bisa meminjam lebih dari 2 buku.");
            return false;
        }
        if (buku.statusPeminjaman()) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku() + " karena sudah dipinjam orang lain.");
            return false;
        }
        buku.statusPeminjaman(true);
        bukuDiPinjam[jumlPinjaman++] = buku;
        System.out.println(nama + " berhasil meminjam " + buku.judulBuku());
        return true;
    }
        public boolean kembalikanBuku(buku buku){
            for (int i = 0; i < jumlPinjaman; i++) {
                if (bukuDiPinjam[i] == buku) {
                    buku.statusPeminjaman(false);
                    bukuDiPinjam[i] = bukuDiPinjam[jumlPinjaman - 1];
                    bukuDiPinjam[jumlPinjaman - 1] = null;
                    jumlPinjaman--;
                    System.out.println(nama + " berhasil mengembalikan buku: " + buku.judulBuku());
                    return true;
                }
            }
            return false;
        }
    void tampilkanPeminjaman(){
        System.out.println(nama + " meminjam: ");
       for (int i = 0; i < jumlPinjaman; i++) {
        System.out.println(bukuDiPinjam[i].judulBuku());
       }
       System.out.println();
    }
}
