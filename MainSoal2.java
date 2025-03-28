
import java.util.HashMap;
import java.util.Map;

public class MainSoal2 {
    public static void main(String[] args) {
        HashMap<Integer, Pemain> mapPemain = new HashMap<>();
        Pemain player1 = new Pemain("Don Lorenzo",20, "CM");
        Pemain player2 = new Pemain("Marc Snuffy",30, "CF");
        Pemain player3 = new Pemain("Gagamaru",25, "GK");
        Pemain player4 = new Pemain("Don Lorenzo",20, "CM");
        Pemain player5 = new Pemain("Messi",37, "RW");
        Pemain player6 = new Pemain("Ronaldo",40, "CF");
        

        masukanData(mapPemain,player1.hashCode(), player1); // Input ke HashMap dan cek duplikat
        masukanData(mapPemain,player2.hashCode(), player2);
        masukanData(mapPemain,player3.hashCode(), player3);
        masukanData(mapPemain,player4.hashCode(), player4);
        masukanData(mapPemain,player5.hashCode(), player5);
        masukanData(mapPemain,player6.hashCode(), player6);
        cariDataPemain(mapPemain, 287712170); //cari data pemain dari key
        printDaftarPemain(mapPemain); //Cetak isi hashmap
   
    }

    public static void printDaftarPemain(HashMap<Integer, Pemain> map) {
        System.out.println("Daftar pemain :");
        int nomor = 1;
        for (Map.Entry<Integer, Pemain> entry : map.entrySet()) {
            System.out.println("Kode Pemain "+nomor+" : " + entry.getKey());
            System.out.println(entry.getValue());
            nomor++;
        }
    }
    public static void cariDataPemain(HashMap<Integer, Pemain> map, int key) {
        if (map.containsKey(key)) {
            System.out.println("Data pemain dengan key : "+key);
            System.out.println(map.get(key));
        } else {
            System.out.println("Tidak ada data pemain.");
        }
    }
    public static void masukanData(HashMap<Integer, Pemain> map,int key, Pemain input) {
        if (map.containsKey(key)) {
            System.out.println("Duplikat data terdeteksi :");
            System.out.println(map.get(key));
        } else {
            map.put(key, input);
        }
    }
    
}
