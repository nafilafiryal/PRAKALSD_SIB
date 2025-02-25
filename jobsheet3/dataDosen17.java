public class dataDosen17 {
    String kode, nama, dosPeng;
    public static void dataSemuaDosen(dosen17[] arrayOfDosen){
        System.out.println("\nData Semua Dosen: ");
        for (dosen17 dosen17 : arrayOfDosen) {
            System.out.println("Kode: " + dosen17.kode);
            System.out.println("Nama: " + dosen17.nama);
            System.out.println("Jenis Kelamin: " + (dosen17.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + dosen17.usia);
            System.out.println("-----------------------------");
        }
    }
    public static void jumlahDosenPerJenisKelamin(dosen17[] arrayOfDosen){
        int jumlLaki = 0;
        int jumlPer = 0;
        for (dosen17 dosen17 : arrayOfDosen) {
            if (dosen17.jenisKelamin) {
                jumlLaki++;
            } else {
                jumlPer++;
            }
        }
        System.out.println("\nJumlah Dosen per Jenis Kelamin: ");
        System.out.println("Laki-laki: " + jumlLaki);
        System.out.println("Perempuan: " + jumlPer);
    }
    public static void rerataUsiaDosenPerJenisKelamin(dosen17[] arrayOfDosen){
        int totUsiaLak = 0;
        int jumlLak = 0;
        int totUsiaPer = 0;
        int jumPer = 0;

        for (dosen17 dosen17 : arrayOfDosen) {
            if (dosen17.jenisKelamin) {
                totUsiaLak += dosen17.usia;
                jumlLak++;
            } else {
                totUsiaPer += dosen17.usia;
                jumPer++;
            }
        }
        System.out.println("\nRata - rata Usia Dosen Per Jenis Kelamin: ");
        if (jumlLak > 0) {
            System.out.println("Laki-laki: " + (double) totUsiaLak / jumlLak);
        } else {
            System.out.println("Laki-laki: Tidak ada data.");
        }
        if (jumPer > 0) {
            System.out.println("Perempuan: " + (double) totUsiaPer / jumPer);
        } else {
            System.out.println("Perempuan: Tidak ada data.");
        }
    }
    public static void infoDosenPalingTua(dosen17[] arrayOfDosen){
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }
        dosen17 dosenTertua = arrayOfDosen[0];
        for (dosen17 dosen17 : arrayOfDosen) {
            if (dosen17.usia > dosenTertua.usia) {
                dosenTertua = dosen17;
            }
        }
        System.out.println("\nInfo Dosen Paling Tua: ");
        System.out.println("Kode: " + dosenTertua.kode);
        System.out.println("Nama: " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTertua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + dosenTertua.usia);

    }
    public static void infoDosenPalingMuda(dosen17[] arrayOfDosen){
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }
        dosen17 dosenTermuda = arrayOfDosen[0];
        for (dosen17 dosen17 : arrayOfDosen) {
            if (dosen17.usia < dosenTermuda.usia) {
                dosenTermuda = dosen17;
            }
        }
        System.out.println("\nInfo Dosen Paling Muda: ");
        System.out.println("Kode: " + dosenTermuda.kode);
        System.out.println("Nama: " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenTermuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + dosenTermuda.usia);
    }
}
