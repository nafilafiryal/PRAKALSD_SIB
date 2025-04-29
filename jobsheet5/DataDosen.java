public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx;

    void tambah(Dosen dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }
    void tampil(){
        if (idx == 0) {
            System.out.println("Belum ada data dosen!");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }
    void SortingASC(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen telah diurutkan dari termuda ke tertua (Bubble Sort)");
    }
    void SortingDSC(){
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIndex];
            dataDosen[maxIndex] = temp;
        }
        System.out.println("Data dosen telah diurutkan dari tertua ke termuda (Selection Sort)");
    }
    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data dosen telah diurutkan dari tertua ke termuda (Insertion Sort)");
    }
    void PencarianDataSequential17(String cari){
        int posisi = -1;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Data ditemukan di indeks ke-" + posisi);
            tampilDataSearch( posisi);
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    void tampilDataSearch(int pos){
        if (pos != -1) {
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + dataDosen[pos].nama);
            System.out.println("jenis kelamin\t : " + (dataDosen[pos].jenisKelamin ? "Laku-laki" : "Perempuan"));
            System.out.println("usia\t : " + dataDosen[pos].usia);
        }
    }
    int[] PencarianDataBinary17(int cari){
        SortingASC();
        int mid = binarySearchUsia(0, idx - 1, cari);

        if (mid == -1) {
            return new int[]{-1};
        }
        int count = 1;
        int left = mid -1;
        while (left >= 0 && dataDosen[left].usia == cari) {
            count++;
            left--;
        }
        int right = mid + 1;
        while (right < idx && dataDosen[right].usia == cari) {
            count++;
            right++;
        }
        int[] hasil = new int[count];
        hasil[0] = mid;

        int index = 1;
        left = mid -1;
        while (left >= 0 && dataDosen[left].usia == cari) {
            hasil[index++] = left;
            left--;
        }
        right = mid + 1;
        while (right < idx && dataDosen[right].usia == cari) {
            hasil[index++] = right;
            right++;
        }
        return hasil;
    }
        int binarySearchUsia(int left, int right, int usiaCari){
            if (right >= left) {
                int mid = left + (right - left) / 2;

                if (dataDosen[mid].usia == usiaCari) {
                    return mid;
                } else if (dataDosen[mid].usia > usiaCari) {
                    return binarySearchUsia(left, mid -1, usiaCari);
                } else {
                    return binarySearchUsia(mid + 1, right, usiaCari);
                }
            }
            return -1;
        }
        void tampilDataSearchUsia(int pos){
            if (pos != -1) {
                System.out.println("Kode: " + dataDosen[pos].kode);
                System.out.println("Nama: " + dataDosen[pos].nama);
                System.out.println("Jenis Kelamin: " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
                System.out.println("Usia: " + dataDosen[pos].usia);
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        }
}