public class SortedLinkedList {
    Node head = null;

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        if (value <= head.data) {
            node.next = head;
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null && value > temp.next.data) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
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

    public void deleteByPosition(int pos) {
        if (pos < 0 || pos >= this.length()) {
            System.out.println("Index out of bounds");
            return;
        }
        if (pos == 0) {
            head = head.next;
        } else {
            Node temp = head;
            int i = 0;
            while ((i + 1) < pos) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
    }

    public void deleteByValue(int value) {
        int pos = find(value);
        if (pos == -1) {
            System.out.println("This value doesn't exist in Linked List");
            return;
        }
        deleteByPosition(pos);
    }

    public void pop() {
        deleteByPosition(0);
    }

    public void popLast() {
        deleteByPosition(this.length() - 1);
    }
}
