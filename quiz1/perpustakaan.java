import java.util.ArrayList;
import java.util.List;

public class perpustakaan {
    buku[] arrayOfBuku = new buku[100];
    mahasiswa[] arrayOfMahasiswa = new mahasiswa[100];
    int jumlahBuku;
    int jumlahMahasiswa;

    public perpustakaan() {
        this.arrayOfBuku = new buku[100];
        this.arrayOfMahasiswa = new mahasiswa[100];
        this.jumlahBuku = 0;
        this.jumlahMahasiswa = 0;
    }

    public void tambahBuku(buku buku) {
        if (jumlahBuku < arrayOfBuku.length) {
            arrayOfBuku[jumlahBuku++] = buku;
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambahkan buku.");
        }
    }

    public void tambahMahasiswa(mahasiswa mahasiswa) {
        if (jumlahMahasiswa < arrayOfMahasiswa.length) {
            arrayOfMahasiswa[jumlahMahasiswa++] = mahasiswa;
            System.out.println("Mahasiswa berhasil ditambahkan!");
        } else {
            System.out.println("Sistem penuh, tidak bisa menambahkan mahasiswa.");
        }
    }

    public buku cariBuku(String kodeBuku) {
        for (int i = 0; i < jumlahBuku; i++) {
                if (arrayOfBuku[i].kodeBuku().equals(kodeBuku)) {
                    return arrayOfBuku[i];
                }
        }
        return null;
    }

    public mahasiswa cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (arrayOfMahasiswa[i].nim().equals(nim)) {
                return arrayOfMahasiswa[i];
            }
        }
        return null;
    }

    public void tampilkanPeminjaman() {
        System.out.println("Daftar Peminjaman Buku:");
        boolean adaPeminjam = false;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (arrayOfMahasiswa[i].jumlPinjaman > 0) {
                arrayOfMahasiswa[i].tampilkanPeminjaman();
                adaPeminjam = true;
            }
        }
        if (!adaPeminjam) {
            System.out.println("Tidak ada mahasiswa yang sedang meminjam buku.");
        }
    }
}
