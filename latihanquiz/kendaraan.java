public class kendaraan {
    String nomorPlat;
    String merk;
    String model;
    int tahun;

    void tampilkanInfo(){
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
    }
    public class mobil {
        int jumlahPintu;

        public mobil(String nomorPlat, String merk, String model, int tahun, int jumlahPintu){
            super(nomorPlat, merk, model, tahun);
            this.jumlahPintu = jumlahPintu;
        }
        double hitungBiayaPerbaikan(int tingkatKerusakan){
            return tingkatKerusakan;
        }
        
    }

    public class motor {
        boolean memilikiBox;

        double hitungBiayaPerbaikan(int tingkatKerusakan){
            return tingkatKerusakan;
        }
    
        
    }
}
