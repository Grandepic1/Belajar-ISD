import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> irregularVerbs = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Input Kosakata");
            System.out.println("1. Input Verb Irregular");
            System.out.println("2. Cari Kata");
            System.out.println("3. Tampil Isi kamus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Irregular Verb: ");
                    String kata = input.nextLine().toLowerCase();
                    if (irregularVerbs.contains(kata)) {
                        System.out.println("Kata sudah ada di kamus.");
                    } else {
                        irregularVerbs.add(kata);
                        System.out.println("Kata berhasil ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Tuliskan kata yang dicari: ");
                    String cari = input.nextLine().toLowerCase();
                    if (irregularVerbs.contains(cari)) {
                        System.out.println("Kata " + cari + " merupakan irregular verb.");
                    } else {
                        System.out.println("Kata " + cari + " bukan merupakan irregular verb.");
                    }
                    break;

                case 3:
                    System.out.println("Irregular verb:");
                    if (irregularVerbs.isEmpty()) {
                        System.out.println("Belum ada kata yang disimpan.");
                    } else {
                        for (String word : irregularVerbs) {
                            System.out.print(word + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}
