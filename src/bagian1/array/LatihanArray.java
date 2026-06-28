package bagian1.array;

public class LatihanArray {
    public static void main(String[] args) {

        // =========================
        // 1. Suhu harian (double)
        // =========================
        double[] suhu = {30.5, 28.0, 31.2, 29.8, 27.5, 32.1};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("Suhu tertinggi: " + tertinggi);
        System.out.println("Suhu terendah: " + terendah);


        // =========================
        // 2. Nama hari > 5 huruf
        // =========================
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("\nNama hari lebih dari 5 huruf:");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }


        // =========================
        // 3. Hitung angka genap
        // =========================
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("\nJumlah angka genap: " + jumlahGenap);
    }
}