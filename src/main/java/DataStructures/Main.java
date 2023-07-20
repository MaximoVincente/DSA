package DataStructures;

import DataStructures.LinkedLists.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(9);

        myLinkedList.append(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());


    }
}