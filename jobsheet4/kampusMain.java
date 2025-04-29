public class kampusMain {
    public static void main(String[] args) {
        kampusDivide k = new kampusDivide();
        int nilaiUTSTertinggi = k.nilaiUTSTertinggi(k.nilaiUTS, 0, k.nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi adalah: " + nilaiUTSTertinggi);
        int nilaiUTSTerendah = k.nilaiUTSTerendah(k.nilaiUTS, 0, k.nilaiUTS.length -1);
        System.out.println("Nilai UTS terendah adalah: " + nilaiUTSTerendah);
    }
}
