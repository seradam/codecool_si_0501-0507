package Basics;

/**
 * Created by seradam on 2017.05.07..
 */
public class Stack {

    Node top;

    public void push(int value){
        if (isEmpty()){
            top = new Node(value);
        }else {
            Node p = new Node(value);
            p.next = top;
            top = p;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printAll(){
        Node current = top;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println(top.data);
        return top.data;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printAll();
        myStack.pop();
        myStack.pop();
        myStack.peek();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.peek();
    }
}
