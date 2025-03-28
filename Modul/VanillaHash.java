public class VanillaHash {
    public static int hashCode(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = hash + input.charAt(i);
        }
        return hash;
    }

    public static int hashCode2(String input){
        final int HASH_MULTIPLIER = 31;
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = hash * HASH_MULTIPLIER + input.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        String nama = "Joey Revaldo";
        String nama1 = "Revaldo Joey";
        System.out.println("Hasil hashcode dari "+nama+" = "+hashCode2(nama));
        System.out.println("Hasil hashcode dari "+nama1+" = "+hashCode2(nama1));
    }
}
