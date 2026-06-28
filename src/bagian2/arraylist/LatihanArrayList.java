import java.util.ArrayList;

public class LatihanArrayList {
    public static void main(String[] args) {

        // =========================
        // 1. Daftar belanja
        // =========================
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        // hapus item ke-2 (index 1)
        belanja.remove(1);

        System.out.println("Daftar belanja:");
        for (String item : belanja) {
            System.out.println("- " + item);
        }

        System.out.println("Jumlah akhir: " + belanja.size());


        // =========================
        // 2. Cari nilai terbesar
        // =========================
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(10);
        angka.add(25);
        angka.add(7);
        angka.add(42);
        angka.add(18);

        int terbesar = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("\nNilai terbesar: " + terbesar);


        // =========================
        // 3. Nama diawali huruf A
        // =========================
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Alya");
        nama.add("Citra");
        nama.add("Arif");
        nama.add("Dina");

        System.out.println("\nNama yang diawali huruf A:");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}