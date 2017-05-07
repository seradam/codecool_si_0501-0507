package Basics;

/**
 * Created by seradam on 2017.05.07..
 */
public class Queue {

    Node first;
    Node last;

    public void push(int value){
        if (isEmpty()){
            first = last = new Node(value);
        }else{
            Node p = new Node(value);
            last.next = p;
            last = p;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        Node temp = first;
        first = first.next;
        return temp.data;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        System.out.println(first.data);
        return first.data;
    }

    public boolean isEmpty(){
        return first == null || last == null;
    }

    public void printAll(){
        Node current = first;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        myQueue.printAll();
        myQueue.pop();
        myQueue.peek();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.peek();
        myQueue.pop();
        myQueue.peek();
    }
}
