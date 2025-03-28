public class HashSet {
    private Node[] buckets;
    private int size;

    public HashSet() {
        this(10);
    }

    public HashSet(int bucketsLength) {
        buckets = new Node[bucketsLength];
        size = 0;
    }

    public int hash(Object x) {
        int h = x.hashCode();
        if (h < 0) h = -h;
        return h % buckets.length;
    }

    public boolean contains(Object x) {
        Node iterator = buckets[hash(x)];
        while (iterator != null) { 
            if (iterator.data.equals(x)) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean add(Object x){
        int h = hash(x);
        Node iterator = buckets[h];
        if (iterator != null){
            if (contains(x)){
                return false;
            }
        }
        Node newNode = new Node(x);
        newNode.next = buckets[h];
        buckets[h] = newNode;
        size++;
        return true;
    }

    public boolean remove(Object x) {
        Node iterator = buckets[hash(x)];
        Node previous = null;
        while (iterator != null) {
            if (iterator.data.equals(x)){
                if (previous == null){
                    buckets[hash(x)] = iterator.next;
                } else {
                    previous.next = iterator.next;
                }
                size--;
                return true;
            }
            previous = iterator;
            iterator = iterator.next;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator != null) {
                System.out.printf("index %d : ", i);
                while (iterator != null){
                    System.out.print(iterator.data+" ");
                    iterator = iterator.next;
                }
                System.out.println();
            }
        }
    }
}
