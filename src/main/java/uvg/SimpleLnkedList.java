package uvg;

public class SimpleLnkedList <T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public SimpleLnkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T remove(T item) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data.equals(item)) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                size--;
                return current.data;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }    
}