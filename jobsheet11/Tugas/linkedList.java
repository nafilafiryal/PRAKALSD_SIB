package Tugas;

public class linkedList {
    mahasiswa front, rear;
    int size;

    public linkedList(){
        front = rear = null;
        size = 0;
    }

    boolean isEmpty(){
        return (front == null);
    }

    public void enqueue(String nama, String nim) {
        mahasiswa newNode = new mahasiswa(nama, nim);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
        System.out.println("Mahasiswa dengan NIM " + nim + " telah masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa dengan NIM " + front.nim + " telah dipanggil.");
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void displayFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: " + front.nama + " (" + front.nim + ")");
        }
    }

    public void displayRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: " + rear.nama + " (" + rear.nim + ")");
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiswa yang mengantre:");
        mahasiswa temp = front;
        while (temp != null) {
            System.out.println("- " + temp.nama + " (" + temp.nim + ")");
            temp = temp.next;
        }
    }

    public void queueSize() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size);
    }

    public void clearQueue() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void checkEmptyQueue() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
        } else {
            System.out.println("Antrian saat ini tidak kosong.");
        }
    }

}
