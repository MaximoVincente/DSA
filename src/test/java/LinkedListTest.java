import DataStructures.LinkedLists.LinkedList;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class LinkedListTest {
    @Test
    void testAMethod() {
        LinkedList myLinkedList = new LinkedList(1);
        int actual = myLinkedList.head.value;
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void removeLastTest() {
        LinkedList sut = new LinkedList(4);
        sut.append(9);
        sut.append(11);
        System.out.println(sut.removeLast().value);
        int actual = sut.removeLast().value;
        int expected = 9;
        assertEquals(actual, expected);

    }

    @Test
    void prependTest() {
        LinkedList sut = new LinkedList(2);
        sut.append(3);
        sut.prepend(1);
        sut.printList();
        int actual = sut.head.value;
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void removeFirstTest() {
        LinkedList sut = new LinkedList(4);
        sut.append(7);
        sut.append(9);
        sut.append(11);
        System.out.println(sut.removeFirst().value);
        int actual = sut.removeFirst().value;
        int expected = 7;
        assertEquals(actual, expected);
    }

    @Test
    void getTest() {
        LinkedList sut = new LinkedList(4);
        sut.prepend(3);
        sut.prepend(2);
        sut.prepend(1);
        System.out.println(sut.get(0).value);
        int actual = sut.get(0).value;
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void setTest() {
        LinkedList sut = new LinkedList(4);
        sut.prepend(3);
        sut.prepend(2);
        sut.prepend(1);
        System.out.println(sut.set(3, 5));
        sut.printList();
        sut.set(3,5);
        int actual = sut.get(3).value;
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    void insertTest() {
        LinkedList sut = new LinkedList(5);
        sut.prepend(3);
        sut.prepend(2);
        sut.prepend(1);
        sut.insert(3,4);
        sut.printList();
        int actual = sut.get(3).value;
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    void removeTest() {
        LinkedList sut = new LinkedList(4);
        sut.prepend(3);
        sut.prepend(2);
        sut.prepend(1);
        sut.remove(2);
        sut.printList();
        int actual = sut.get(2).value;
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    void reverseTest() {
        LinkedList sut = new LinkedList(4);
        sut.prepend(3);
        sut.prepend(2);
        sut.prepend(1);
        sut.reverse();
        sut.printList();
        int actual = sut.get(0).value;
        int expected = 4;
        assertEquals(actual, expected);
    }

}
