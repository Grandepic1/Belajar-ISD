public class Main {

    public static void main(String[] args) {

        String[] daftarKota = {
                "London", "Salisbury", "Bristol", "Birmingham", "Cardiff",
                "Manchester", "Kingston", "Liverpool", "Newcastle", "Edinburgh", "Glasgow"
        };

        AdjacencyList map = new AdjacencyList(daftarKota.length);

        for (String kota : daftarKota) {
            map.tambahKota(kota);
        }

        map.tambahJalur("London", "Salisbury");
        map.tambahJalur("London", "Birmingham");
        map.tambahJalur("Salisbury", "Bristol");
        map.tambahJalur("Bristol", "Birmingham");
        map.tambahJalur("Birmingham", "Cardiff");
        map.tambahJalur("Birmingham", "Kingston");
        map.tambahJalur("Birmingham", "Manchester");
        map.tambahJalur("Manchester", "Kingston");
        map.tambahJalur("Manchester", "Liverpool");
        map.tambahJalur("Manchester", "Newcastle");
        map.tambahJalur("Manchester", "Glasgow");
        map.tambahJalur("Newcastle", "Edinburgh");
        map.tambahJalur("Newcastle", "Kingston");

        System.out.println();
        map.bfs("London");
        System.out.println();
        map.dfs("London");
    }
}