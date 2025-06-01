
public class Main {
    public static void main(String[] args) {
        daftarLaundry daftarCucian = new daftarLaundry();

        daftarCucian.terimaCucian(new Laundry(1, "Intan", 3, "biasa", 5));
        daftarCucian.terimaCucian(new Laundry(2, "Dudi", 4, "express", 3));
        daftarCucian.terimaCucian(new Laundry(3, "Ruli", 4, "kilat", 1));
        daftarCucian.terimaCucian(new Laundry(4, "Susi", 5, "biasa", 2));
        daftarCucian.terimaCucian(new Laundry(5, "Ira", 6, "biasa", 5));
        daftarCucian.terimaCucian(new Laundry(6, "Mayang", 7, "kilat", 4));
        daftarCucian.tampilkanUrutan();
    }
}
