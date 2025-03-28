public class BelajarHash {
    public static void main(String[] args) {
        int[] buckets = new int[5];
        String x = "ququq";
        int h = x.hashCode();
        if (h < 0) h = -h;
        int i = h % buckets.length;
        System.out.println(i);
    }
}
