package Basics;

/**
 * Created by seradam on 2017.05.07..
 */
public class LinkedList {

    Node startNode;

    public void add(int value){
        if (startNode == null){
            startNode = new Node(value);
        }else {
            Node current = startNode;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public void printAll(){
        Node current = startNode;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Node remove(int value){
        Node current = startNode;
        while (current.next.data != value){
            current = current.next;
            if (current.next == null){
                System.out.println("This Linked List doesn't contain this item: " + value);
                return null;
            }
        }
        Node removed = current.next;
        current.next = current.next.next;
        System.out.println("This item removed from the Linked List: " + removed.data);
        return removed;
    }

    public Node search(int value){
        Node current = startNode;
        while (current.data != value){
            current = current.next;
            if (current == null){
                System.out.println("This Linked List doesn't contain this item: " + value);
                return null;
            }
        }
        System.out.println("This Linked List contain this item: " + current.data);
        return current;
    }

    public void insert(int prev, int insertable){
        Node current = startNode;
        while (current.data != prev){
            current = current.next;
            if (current == null){
                System.out.println("This Linked List doesn't contain this item: " + prev);
                return;
            }
        }
        Node temp = current.next;
        current.next = new Node(insertable);
        current.next.next = temp;
        System.out.println(current.next.data + " inserted between " + current.data + " and " + temp.data );
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printAll();
        ll.search(3);
        ll.search(6);
        ll.insert(3, 99);
        ll.printAll();
        ll.remove(4);
        ll.printAll();
    }
}
