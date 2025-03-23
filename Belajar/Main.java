import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<ResepMakanan> linkedList = new SinglyLinkedList<>("Resep");
        Scanner userInput = new Scanner(System.in);
        
        while (true) { 
            System.out.print("""
                1. Tambah resep dari depan
                2. Tambah resep dari belakang
                3. Hapus resep dari depan
                4. Hapus resep dari belakang
                5. Tampilkan semua resep
                6. Cari resep
                7. Keluar
                Pilihan: """);
            
            int input = userInput.nextInt();
            userInput.nextLine();
            
            switch (input) {
                case 1, 2 -> {
                    ResepMakanan resep = inputResep(userInput);
                    if (input == 1) {
                        linkedList.insertAtFront(resep);
                    } else {
                        linkedList.insertAtBack(resep);
                    }
                    System.out.println("Berhasil memasukan resep");
                }
                case 3 -> System.out.println("Berhasil menghapus " + linkedList.removeFromFront());
                case 4 -> System.out.println("Berhasil menghapus " + linkedList.removeFromBack());
                case 5 -> linkedList.print();
                case 6 -> {
                    System.out.print("Masukkan nama resep: ");
                    String namaResep = userInput.nextLine();
                    linkedList.cariResep(namaResep);
                }
                case 7 -> {
                    System.out.println("Keluar");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static ResepMakanan inputResep(Scanner userInput) {
        System.out.print("Masukkan nama resep: ");
        String namaResep = userInput.nextLine();
        System.out.print("Masukkan nama bahan utama: ");
        String bahanUtama = userInput.nextLine();
        System.out.print("Masukkan waktu: ");
        int waktu = userInput.nextInt();
        userInput.nextLine();
        return new ResepMakanan(namaResep, bahanUtama, waktu);
    }
}
