package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        System.out.println("=== Daftar Buku ===");
        perpus.tampilkanSemua();

        System.out.println("\n=== Kembalikan Buku (No.1) ===");
        perpus.kembalikanBuku("Laskar Pelangi");

        System.out.println("\n=== Cari Penulis (No.3) ===");
        perpus.cariPenulis("Andrea Hirata");
    }
}