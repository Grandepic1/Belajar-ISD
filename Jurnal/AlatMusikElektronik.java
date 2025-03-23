public class AlatMusikElektronik implements Comparable<AlatMusikElektronik>{
    private String kodeAlatMusik;
    private String namaAlatMusik;
    private String kategori;
    private int hargaPerUnit;
    private int stok;
    
    public AlatMusikElektronik(String kodeAlatMusik, String namaAlatMusik, String kategori, int hargaPerUnit, int stok){
        this.kodeAlatMusik = kodeAlatMusik;
        this.namaAlatMusik = namaAlatMusik;
        this.kategori = kategori;
        this.hargaPerUnit = hargaPerUnit;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "AlatMusikElektronik [kode=" + kodeAlatMusik + ", nama=" + namaAlatMusik + ", kategori=" + kategori + ", harga=Rp." + hargaPerUnit
                + ", stok=" + stok + "]";
    }

    public String getKode() {
        return kodeAlatMusik;
    }

    public void setKode(String kode) {
        this.kodeAlatMusik = kode;
    }

    public String getNama() {
        return namaAlatMusik;
    }

    public void setNama(String nama) {
        this.namaAlatMusik = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() {
        return hargaPerUnit;
    }

    public void setHarga(int harga) {
        this.hargaPerUnit = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int compareTo(AlatMusikElektronik o){
        return this.getKode().compareTo(o.getKode());
    }

} 
