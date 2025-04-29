public class kampusBruteForce {
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    public double rataUAS(){
        int total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }
        return (double) total / nilaiUAS.length;
    }
    
}
