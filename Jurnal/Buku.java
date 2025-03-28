public class Buku {
    private String ISBN;
    private String judulBuku;
    private String kategoriBuku;
    private double hargaPinjam;
    private boolean status;

    public Buku(String ISBN, String judulBuku, String kategoriBuku, double hargaPinjam, boolean status) {
        this.ISBN = ISBN;
        this.judulBuku = judulBuku;
        this.kategoriBuku = kategoriBuku;
        this.hargaPinjam = hargaPinjam;
        this.status = status;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setKategoriBuku(String kategoriBuku) {
        this.kategoriBuku = kategoriBuku;
    }

    public void setHargaPinjam(double hargaPinjam) {
        this.hargaPinjam = hargaPinjam;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        String statusPinjam;
        if (status == true) {
            statusPinjam = "Tidak tersedia";
        } else {
            statusPinjam = "Tersedia";
        }
        return "Buku [ISBN = " + ISBN + ", Judul buku = " + judulBuku + ", Kategori buku = " + kategoriBuku
                + ", Harga pinjam = Rp."
                + hargaPinjam + ", status = " + statusPinjam + "]";
    }
}
