import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }


    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        return removedItem;
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> iterator = firstNode;

            while (iterator.next != lastNode) {
                iterator = iterator.next;
            }
            lastNode = iterator;
            iterator.next = null;
        }

        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("List %s: %n", name);

        ListNode<E> iterator = firstNode;

        while (iterator != null) {
            System.out.printf("%s", iterator.data);
            iterator = iterator.next;

            System.out.println();
        }
    }

    public void cariResep(String namaResep) {
        ListNode<E> current = firstNode;
        while (current != null) {
            if (current.data instanceof ResepMakanan) {
                ResepMakanan resep = (ResepMakanan) current.data;
                if (resep.getNamaResep().equals(namaResep)) {
                    System.out.println("Resep ditemukan: " + resep);
                    return;
                }
            }
            current = current.next;
        }
        System.out.println("Resep tidak ditemukan");
    }
}