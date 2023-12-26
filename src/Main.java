public class Main {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.add(56);
        L1.add(70);
        L1.insertAtPosition(1, 30);
        L1.display();
        int find = L1.find(30);
        if (find == -1)
            System.out.println("Node not found");
        else
            System.out.println("Node found at position " + find);

    }
}