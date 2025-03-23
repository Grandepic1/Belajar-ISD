public class ResepMakanan {
    private String namaResep;
    private String bahanUtama;
    private Integer waktuMemasak;

    public ResepMakanan(String namaResep, String bahanUtama, Integer waktuMemasak) {
        this.namaResep = namaResep;
        this.bahanUtama = bahanUtama;
        this.waktuMemasak = waktuMemasak;
    }

    public String getNamaResep() {
        return namaResep;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public Integer getWaktuMemasak() {
        return waktuMemasak;
    }

    @Override
    public String toString() {
        return "Nama Resep = " + namaResep + ", Bahan Utama = " + bahanUtama + ", Waktu Memasak = " + waktuMemasak;
    }

}
