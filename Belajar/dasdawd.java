import java.util.Scanner;

public class dasdawd {
    public static void main(String[] args) {
        SinglyLinkedList<ResepMakanan> linkedList = new SinglyLinkedList<>("resep");
        Scanner userInput = new Scanner(System.in);

        while (true) {
            //Menu
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Resep");
            System.out.println("2. Hapus Resep Diawal Jumlah");
            System.out.println("3. Hapus Resep Diakhir");
            System.out.println("4. Tampilakan Resep");
            System.out.println("5. Cari Resep");
            System.out.println("6. Keluar");
            System.out.println("Pilih Opsi (1-6: ");
            int input = userInput.nextInt();
            userInput.nextLine();

    switch (input) {
        case 1, 2->  {
            ResepMakanan resep = inputResep(userInput);
            if (input == 1) {
                linkedList.insertAtFront(resep);
            } else {
                linkedList.insertAtBack(resep);
            }
            System.out.println("Berhasil memasukan resep");
        }
        case 3 -> System.out.println("Berhasil Menghapus " + linkedList.removeFromFront());
        case 4 -> System.out.println("Berhasil Menghapus " + linkedList.removeFromBack());
        case 5 -> linkedList.print();
        case 6 -> {
            System.out.print("Masukan nama resep: ");
            String namaResep = userInput.nextLine();
            linkedList.CariResep(namaResep);
        } 
        case 7 -> {
            System.out.println("keluar");
            return;
        } 
        default -> System.out.println("Pilihan tidak valid");
    }
            }
        }

        public static ResepMakanan inputResep(Scanner userInput) {
            System.out.print("Masukan nama Resep: ");
            String namaResep = userInput.nextLine();
            System.out.print("Masukan nama bahan utama");
            String bahanUtama = userInput.nextLine();
            System.out.print("Masukan Waktu: ");
            int waktu = userInput.nextInt();
            userInput.nextLine();
            return new ResepMakanan(namaResep, bahanUtama, waktu);
        }}

        