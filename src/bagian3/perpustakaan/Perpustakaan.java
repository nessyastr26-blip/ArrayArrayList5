package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> daftar = new ArrayList<>();

    public void tambahBuku(Buku b) {
        daftar.add(b);
    }

    public void tampilkanSemua() {
        for (Buku b : daftar) {
            System.out.println(b.info());
        }
    }

    // =========================
    // No. 1: kembalikan buku
    // =========================
    public void kembalikanBuku(String judul) {
        for (Buku b : daftar) {
            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false);
                System.out.println("Buku '" + judul + "' dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // =========================
    // No. 3: cari penulis
    // =========================
    public void cariPenulis(String penulis) {
        boolean ketemu = false;

        for (Buku b : daftar) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println(b.info());
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada buku dari penulis " + penulis);
        }
    }
}