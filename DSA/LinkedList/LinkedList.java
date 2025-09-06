
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // properties
    public static Node head;
    public static Node tail;
    public static int size;

    // methods
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public static int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void addAt(int data, int idx) {
        Node newNode = new Node(data);
        int len = length();

        // base case
        if (head == null || idx == 0) {
            addFirst(data);
            return;
        }
        if (len == idx) {
            addLast(data);
            return;
        }
        if (len < idx) {
            System.out.println("\nPlease enter valid index !!!");
            return;
        }

        int count = 0;
        Node temp = head;
        while (count < idx - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;

    }

    public static void printList() {
        if (head == null)
            System.out.println("List is Empty !!!");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addAt(4, 1);
        ll.addAt(5, 0);
        ll.addAt(6, 5);
        System.out.println("size : " + size);
        System.out.println("length : " + ll.length());
        ll.printList();
        ll.addAt(7, 10);

    }
}
