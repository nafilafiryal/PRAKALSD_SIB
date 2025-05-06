public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max, totalDilayani;

    public AntrianKRS(int max){
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDilayani = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == max;
    }
     public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan.");
     }

    public void panggilKRS(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2. Tidak bisa memproses KRS.");
            return;
        }
        System.out.println("Memproses KRS untuk: ");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Semua Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void lihatDuaTerdepan(){
        if (size < 2) {
            System.out.println("Belum ada 2 mahasiswa dalam antrian.");
            return;
        }
        System.out.println("Dua Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            data[rear].tampilkanData();
        }
    }

    public void clear(){
        front = 0;
        rear = -1;
        size = 0;
        totalDilayani = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getTotalDilayani(){
        return totalDilayani;
    }

    public int getBelumDilayani(){
        return max * 3 - totalDilayani;
    }
}
