public class kampusDivide {
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
    int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
    int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    public int nilaiUTSTertinggi(int[] nilai, int left, int right){
        if (left == right) {
            return nilai[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = nilaiUTSTertinggi(nilai, left, mid);
        int maxRight = nilaiUTSTertinggi(nilai, mid + 1, right);

        if (maxLeft > maxRight) {
            return maxLeft;
        } else {
            return maxRight;
        }
    }
    public int nilaiUTSTerendah(int[] nilai, int left, int right){
        if (left == right) {
            return nilai[left];
        }
        int mid = (left + right) /2;
        int minLeft = nilaiUTSTerendah(nilai, left, mid);
        int minRight = nilaiUTSTerendah(nilai, mid + 1, right);

        if (minLeft < minRight) {
            return minLeft;
        } else {
            return minRight;
        }
    }
}
