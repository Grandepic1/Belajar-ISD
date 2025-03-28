public class Pemain{
    private String nama;
    private String posisi;

    public Pemain(String nama, String posisi){
        this.nama = nama;
        this.posisi = posisi;
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
        return hash;
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
        return nama.equals(pemain.nama) && posisi.equals(pemain.posisi);
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
                "Posisi: " + posisi + "\n";
    }
}