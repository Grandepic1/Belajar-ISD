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
        if (h < 0)
            h = -h;
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

    public boolean add(Object x) {
        int h = hash(x);
        Node iterator = buckets[h];
        if (iterator != null) {
            if (contains(x)) {
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
            if (iterator.data.equals(x)) {
                if (previous == null) {
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
        System.out.println("Daftar pemain :");
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator != null) {
                System.out.printf("Pemain %d : ", i + 1);
                while (iterator != null) {
                    System.out.print(iterator.data + " ");
                    iterator = iterator.next;
                }
                System.out.println();
            }
        }
    }

    public void printWithRole(boolean isUtama) {
        String status = "";
        if (isUtama) {
            status = "List pemain utama:";
        } else {
            status = "List pemain cadangan:";
        }
        System.out.println(status);
        for (int i = 0; i < buckets.length; i++) {
            System.out.printf("Pemain %d : ", i + 1);
            Node iterator = buckets[i];
            boolean firstPlayer = false;

            while (iterator != null) {
                if (isUtama && firstPlayer) {
                    System.out.println(iterator.data);
                } else if (!isUtama && !firstPlayer) {
                    System.out.println(iterator.data);
                }
                firstPlayer = true;
                iterator = iterator.next;
            }
        }
    }

}
