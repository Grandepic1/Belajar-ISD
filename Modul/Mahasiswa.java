public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(String nim, String nama2, String kelas){
        this.nim = nim;
        nama = nama2;
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "Nim = " + nim + ", Nama=" + nama + ", Kelas=" + kelas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    

    
}
