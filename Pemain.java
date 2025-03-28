public class Pemain{
    private String nama;
    private int umur;
    private String posisi;

    public Pemain(String nama, int umur,String posisi){
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPosisi() {
        return posisi;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 31;
        int hash = 0;
        for (int i = 0; i < nama.length(); i++) {
            hash = hash * HASH_MULTIPLIER + nama.charAt(i);
        }
        for (int i = 0; i < posisi.length(); i++) {
            hash = hash * HASH_MULTIPLIER + posisi.charAt(i);
        }
        return hash*HASH_MULTIPLIER+umur;
    }

    @Override
    public boolean equals(Object object){
        if (this==object){
            return true;
        }
        if (object == null || getClass() != object.getClass()){
            return false;
        }
        Pemain pemain = (Pemain) object;
        return nama.equals(pemain.nama) && posisi.equals(pemain.posisi) && umur == pemain.umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Umur: " + umur + " tahun \n"+
                "Posisi: " + posisi + "\n";
    }
}