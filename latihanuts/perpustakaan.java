public class perpustakaan {
    buku[] daftarBuku = new buku[100];
    mahasiswaQuiz[] daftarMahasiswa = new mahasiswaQuiz[100];
    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    void tambahBuku(buku buku){
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas buku penuh.");
        }
    }
    void tambahMahasiswa(mahasiswaQuiz mhs){
        if (jumlahMahasiswa < daftarMahasiswa.length) {
            daftarMahasiswa[jumlahMahasiswa]=mhs;
            jumlahMahasiswa++;
            System.out.println("Mahasiswa berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas mahasiswa penuh.");
        }
    }
    void pinjamBuku(String nim, String kodeBuku){
        mahasiswaQuiz mhs = cariMahasiswa(nim);
    }
}
