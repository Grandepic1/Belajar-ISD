import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    private static final LinkedList<Buku> listBuku = new LinkedList<>();
        public static void main(String[] args) {
        listBuku.add(new Buku("001-1-1", "Tutorial Mahir Python", "IT", 15000, true));
        listBuku.addFirst(new Buku("001-1-2", "Cara Menjadi Orang Sukses", "Bisnis", 20000, false));
        listBuku.add(new Buku("001-1-3", "Naruto", "Komik", 10000, true));
        listBuku.addFirst(new Buku("001-1-4", "Soekarno", "Sejarah", 15000, true));
        listBuku.add(new Buku("001-1-5", "Ilmu Pengetahuan Alam", "Pelajaran", 20000, false));
        lihatList();
        hapusBuku("001-1-2");
        editJudul("001-1-1", "Tutorial cupu python");
        editStatus("001-1-5", true);
        editHargaPinjam("001-1-3", 20000);
        lihatList();
        lihatListReverse();
    }

    public static void hapusBuku(String ISBN){
        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()){
            Buku buku = iterator.next();
            if (buku.getISBN().equals(ISBN)){
                iterator.remove();
            }
        }
    }

    public static void editJudul(String ISBN, String judulBaru){
        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()){
            Buku buku = iterator.next();
            if (buku.getISBN().equals(ISBN)){
                buku.setJudulBuku(judulBaru);;
            }
        }
    }

    public static void editStatus(String ISBN, boolean statusBaru){
        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()){
            Buku buku = iterator.next();
            if (buku.getISBN().equals(ISBN)){
                buku.setStatus(statusBaru);
            }
        }
    }

    public static void editHargaPinjam(String ISBN, double  hargaPinjamBaru){
        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()){
            Buku buku = iterator.next();
            if (buku.getISBN().equals(ISBN)){
                buku.setHargaPinjam(hargaPinjamBaru);
            }
        }
    }

    public static void lihatList(){
        System.out.println("List buku :");
        for (Buku buku : listBuku){
            System.out.println(buku);
        }
    }
    public static void lihatListReverse(){
        ListIterator<Buku> iterator = listBuku.listIterator(listBuku.size());
        System.out.println("List buku reverse:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
    

}