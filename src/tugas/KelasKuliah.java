package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    // tambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        daftar.add(m);
    }

    // jumlah data
    public int jumlahData() {
        return daftar.size();
    }

    // hitung rata-rata nilai
    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftar) {
            total += m.getNilai();
        }

        return daftar.isEmpty() ? 0 : total / daftar.size();
    }

    // jumlah mahasiswa lulus
    public int jumlahLulus() {
        int count = 0;

        for (Mahasiswa m : daftar) {
            if (m.lulus()) {
                count++;
            }
        }

        return count;
    }

    // tampil semua
    public void tampilkanSemua() {
        System.out.println("=== Data Mahasiswa ===");

        for (Mahasiswa m : daftar) {
            System.out.println(m.info());
        }
    }
}