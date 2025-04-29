public class mahasiswaQuiz {
    String nim;
    String nama;
    buku[] bukuDiPinjam = new buku[2];

    public mahasiswaQuiz(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    public boolean pinjamBuku(buku buku){
        if (buku.isDiPinjam()) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena sudah dipinjam orang lain.");
            return false;
        }
        for (int i = 0; i < bukuDiPinjam.length; i++) {
            if (bukuDiPinjam[i] == null) {
                bukuDiPinjam[i] = buku;
                buku.pinjam();
                System.out.println(nama + " berhasil meminjam " + buku.judulBuku);
                return true;
            }
        }
        return false;
    }
    public void tampilkanPeminjaman(){
        System.out.print(nama + " meminjam: ");
        boolean ada = false;
        for (buku b : bukuDiPinjam) {
            if (b != null) {
                System.out.print(b.judulBuku + ", ");
                ada = true;
            }
        }
        if (!ada) {
            System.out.print("Tidak meminjam buku");
        }
        System.out.println();
    }
}
