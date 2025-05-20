package dll;

public class doubleLinkedList17 {
    node17 head;
    node17 tail;
    private int size;

    public doubleLinkedList17(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(mahasiswa17 data){
        node17 newNode17 = new node17(data);
        if (isEmpty()) {
            head = tail = newNode17;
        } else {
            newNode17.next = head;
            head.prev = newNode17;
            head = newNode17;
        }
        size++;
    }

    public void addLast(mahasiswa17 data){
        node17 newNode17 = new node17(data);
        if (isEmpty()) {
            head = tail = newNode17;
        } else {
            tail.next = newNode17;
            newNode17.prev = tail;
            tail = newNode17;
        }
        size++;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Warning: Linked List masih kosong.");
            return;
        }
        System.out.println("Jumlah data: " + size);
        System.out.println("Isi Double Linked List:");
        node17 current = head;
        int i = 0;
        while (current != null) {
            System.out.print("[" + i + "]");
            current.data.tampil();
            current = current.next;
            i++;
        }
    }

    public void insertAfter(String keyNim, mahasiswa17 data){
        node17 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node17 newNode17 = new node17(data);

        // Jika current adalah tail, cukup tambahkan di ahir
        if (current == tail) {
            current.next = newNode17;
            newNode17.prev = current;
            tail = newNode17;
        } else {
            // sisipkan di tengah
            newNode17.next = current.next;
            newNode17.prev = current;
            current.next.prev = newNode17;
            current.next = newNode17;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public node17 search(String nim){
        node17 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, mahasiswa17 data){
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid!");
            return;
        }

        if (index == size) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }
        node17 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        node17 newNode17 = new node17(data);
        newNode17.next = current;
        newNode17.prev = current.prev;
        current.prev.next = newNode17;
        current.prev = newNode17;

        size++;
        System.out.println("Data berhasil disisipkan pada indeks " + index);
    }

    public void removeAfter(String keyNim){
        node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node yang dapat dihapus setelah NIM " + keyNim);
            return;
        }
        node17 temp = current.next;

        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        temp.data.tampil();

        if (temp == tail) {
            tail = current;
            current.next = null; 
        } else {
            current.next = temp.next;
            temp.next.prev = current;
        }
        size--;
    }

    public void remove(int index){
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        node17 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        current.data.tampil();

        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;
    }

    public void getFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data!");
            return;
        }
        System.out.println("Data pada node head: ");
        head.data.tampil();
    }
    public void getLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data!");
            return;
        }
        System.out.println("Data pada node tail:");
        tail.data.tampil();
    }
    public void getIndex(int index){
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        node17 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks " + index + ":");
        current.data.tampil();
    }

    public int size(){
        return size;
    }
}
