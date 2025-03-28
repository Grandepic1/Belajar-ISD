
import java.util.HashMap;
import java.util.Map;

public class MainPemain {
    public static void main(String[] args) {
        HashMap<Integer, Pemain> mapPemain = new HashMap<>();
        Pemain player1 = new Pemain("Don Lorenzo", "CM");
        Pemain player2 = new Pemain("Marc Snuffy", "CF");
        Pemain player3 = new Pemain("Gagamaru", "GK");
        Pemain player4 = new Pemain("Nagi", "RW");
        Pemain player5 = new Pemain("Chigiri", "LW");
        Pemain player6 = new Pemain("Don Lorenzo", "CM");
        int player1Code = player1.hashCode();
        int player2Code = player2.hashCode();
        int player3Code = player3.hashCode();
        int player4Code = player4.hashCode();
        int player5Code = player5.hashCode();
        int player6Code = player6.hashCode();

        mapPemain.put(player1Code, player1);
        mapPemain.put(player2Code, player2);
        mapPemain.put(player3Code, player3);
        mapPemain.put(player4Code, player4);
        mapPemain.put(player5Code, player5);
        mapPemain.put(player6Code, player6);

        System.out.println("Daftar Pemain: ");
        for (Map.Entry<Integer, Pemain> entry : mapPemain.entrySet()) {
            System.out.println("Kode Pemain : "+ entry.getKey()+"\n"+ entry.getValue());
            
        }

        if (player1.equals(player6) && player1.hashCode() == player6.hashCode()) {
            System.out.println("Player 1 dan Player 6 adalah pemain yang sama");
        } else {
            System.out.println("Player 1 dan Player 6 adalah pemain yang berbeda");

        }

    }
}
