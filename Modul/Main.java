
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> teamTopSix = new HashMap<>();
        teamTopSix.put("Rin Itoshi", 16);
        teamTopSix.put("Joey", 19);
        teamTopSix.put("Kairi", 20);
        teamTopSix.put("Rin Itoshi", 16);
        Set<String> keySet = teamTopSix.keySet();

        for (String key : keySet) {
            int umur = teamTopSix.get(key);
            System.out.println("Nama : "+key+", Umur : "+umur);
        }

    }
}
