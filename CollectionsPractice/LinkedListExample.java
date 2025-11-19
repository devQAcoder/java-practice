package CollectionsPractice;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add a new node at the end
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}
