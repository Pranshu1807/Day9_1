public class LinkedList {
    Node head = null;

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int find(int value) {
        Node temp = head;

        int i = 0;
        while (temp != null) {
            if (temp.data == value)
                return i;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int length() {
        Node temp = head;

        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public void insertAtPosition(int position, int value) {
        int length = length();
        if (position < 0 || position > length) {
            System.out.println("Index out of bounds");
            return;
        }
        Node node = new Node(value);
        if (position == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            int i = 0;
            while ((i + 1) < position) {
                temp = temp.next;
                i++;
            }
            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
    }
}
