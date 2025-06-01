import java.util.PriorityQueue;

public class daftarLaundry {
    private static PriorityQueue<Laundry> daftar = new PriorityQueue<>();

    public void terimaCucian(Laundry cucian) {
        daftar.add(cucian);
    }

    public void tampilkanUrutan() {
        System.out.println("Urutan cucian harus diselesaikan:");
        while (!daftar.isEmpty()) {
            Laundry cucian = daftar.poll();
            System.out.println("idCuci = " + cucian.getId() + ", namaPelanggan = " + cucian.getNamaPelanggan());
        }
    }
}
