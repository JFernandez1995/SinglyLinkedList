package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList SLL = new LinkedList();

        Node head = new Node();

        SLL.addToEnd( head,5 );
        SLL.addToEnd( head,6 );
        SLL.removeTail(head);

        System.out.println("Here are the contents in the SLL ");
        SLL.printAll(head);

        System.out.println(" ");
        System.out.println("The size of the Singly Linked List is: " +  SLL.size( head ) );
    }
}
