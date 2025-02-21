public class jobsheet1Fungsi {
    static String[] cabangToko = {
        "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"
    };
    static double aglonema = 75000, keladi = 50000, alocasi = 60000, mawar = 10000;
    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static void pendapatan(){
        for (int i = 0; i < 4; i++) {
           double harga = (aglonema * stockBunga[i][0]) + (keladi * stockBunga[i][1]) + (alocasi * stockBunga[i][2]) + (mawar * stockBunga[i][3]);
           System.out.println("Pendapatan Cabang RoyalGarden " + (i+1) + ": " + harga);
        }
    }
    static void jumlahStokRoyGar4(){
        int cabangIndex = 3;
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("Stok sebelum Pengurangan di RoyalGarden 4: ");
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println(jenisBunga[i] + ": " + stockBunga[cabangIndex][i]);
        }
        stockBunga[cabangIndex][0] -= 1;
        stockBunga[cabangIndex][1] -= 2;
        stockBunga[cabangIndex][2] -= 0;
        stockBunga[cabangIndex][3] -= 5;
        System.out.println("=====================================");

        System.out.println("Stok Setelah Pengurangan di RoyalGarden 4: ");
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println(jenisBunga[i] + ": " + stockBunga[cabangIndex][i]);
        }
        System.out.println("=====================================");
    }
    public static void main(String[] args) {
        System.out.println("           ROYAL GARDEN");
        System.out.println("=====================================");
        pendapatan();
        System.out.println("=====================================");
        jumlahStokRoyGar4();
    }
}
