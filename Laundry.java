class Laundry implements Comparable<Laundry> {
    private int id;
    private String namaPelanggan;
    private int tanggalMasuk;
    private String tipe;
    private int berat;

    public Laundry(int id, String namaPelanggan, int tanggalMasuk, String tipe, int berat) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.tipe = tipe;
        this.berat = berat;
    }

    public int getId() {
        return id;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    private int getWaktuSelesai() {
        return switch (tipe) {
            case "kilat" -> tanggalMasuk + 1;
            case "express" -> tanggalMasuk + 2;
            case "biasa" -> tanggalMasuk + 3;
            default -> tanggalMasuk + 3;
        };
    }

    @Override
    public int compareTo(Laundry lain) {
        return Integer.compare(this.getWaktuSelesai(), lain.getWaktuSelesai());
    }

}