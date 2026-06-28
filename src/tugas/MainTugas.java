package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // objek kelas kuliah
        KelasKuliah kelas = new KelasKuliah();

        // tambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "101", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "102", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "103", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "104", 65));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "105", 45));

        // tampil data
        kelas.tampilkanSemua();

        // array mata kuliah
        String[] matkul = {"PBO", "Struktur Data", "Kalkulus"};

        System.out.println("\n=== Mata Kuliah ===");
        for (String mk : matkul) {
            System.out.println("- " + mk);
        }

        // rata-rata & jumlah lulus
        System.out.println("\nRata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus: " + kelas.jumlahLulus());

        // tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "106", 90));

        System.out.println("\n=== Setelah Tambah Mahasiswa ===");
        kelas.tampilkanSemua();

        System.out.println("Jumlah data terbaru: " + kelas.jumlahData());
    }
}