
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
                        5. Tampilkan semua resep\n6. Cari resep
                        7. Keluar
                        Pilihan: """);
            int input = userInput.nextInt();
            if (input == 1 || input == 2) {
                userInput.nextLine();
                System.out.print("Masukan nama resep : ");
                String namaResep = userInput.nextLine();
                System.out.print("Masukan nama bahan utama : ");
                String bahanUtama = userInput.nextLine();
                System.out.print("Masukan waktu : ");
                int waktu = userInput.nextInt();
                if (input == 1) {
                    linkedList.insertAtFront(new ResepMakanan(namaResep, bahanUtama, waktu));
                } else if (input == 2) {
                    linkedList.insertAtBack(new ResepMakanan(namaResep, bahanUtama, waktu));
                }
                System.out.println("Berhasil memasukan data resep");
            }
            if (input == 3) {
                System.out.println("Berhasil menghapus " + linkedList.removeFromFront());
            }
            if (input == 4) {
                System.out.println("Berhasil menghapus " + linkedList.removeFromBack());
            }
            if (input == 5) {
                linkedList.print();
            }
            if (input == 6) {
                System.out.print("Masukan nama resep : ");
                userInput.nextLine();
                String namaresep = userInput.nextLine();
                linkedList.cariResep(namaresep);
            }
            if (input == 7) {
                break;
            }
        }

    }
}
