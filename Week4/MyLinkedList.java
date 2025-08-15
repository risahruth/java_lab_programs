class MyLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);

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
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found.");
            return;
        }

        prev.next = current.next;
    }
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        System.out.println("2024503543 Risah Ruth R");
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List:");
        list.display();

        System.out.println("Search 20: " + list.search(20)); 
        System.out.println("Search 50: " + list.search(50)); 

        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        list.delete(50); 
    }
}

