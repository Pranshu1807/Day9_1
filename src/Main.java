public class Main {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.add(56);
        L1.add(70);
        L1.insertAtPosition(1, 30);
        L1.insertAfter(40, 30);
        L1.display();
        System.out.println("The size of Linked List is " + L1.length());

        L1.deleteByValue(40);
        L1.display();
        System.out.println("The size of Linked List is " + L1.length());
    }
}