package uvg;

public class DoubleLinkedList<T>
{
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Agregar un elemento al final de la lista
    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Eliminar un elemento de la lista
    public T remove(T item) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                
                size--;
                return current.data;
            }
            current = current.next;
        }
        return null; // Si el elemento no se encuentra
    }

    // Obtener un elemento por índice
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.data;
    }
}
