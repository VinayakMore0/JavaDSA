package L19LinkedList;

public class LinkedListClient {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(20);
        ll.display();
        ll.addFirst(30);
        ll.display();
        ll.addFirst(40);
        ll.display();
        ll.addFirst(50);
        ll.display();
        ll.addLast(100);
        ll.display();
        ll.addLast(200);
        ll.display();
        ll.addAt(250, 3);
        ll.display();

        ll.removeFirst();
        ll.display();
        ll.removeLast();
        ll.display();
        ll.removeAt(3);
        ll.display(); 



    }

}
