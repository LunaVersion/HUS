package hus.oop.lab9.mylist;

public class TestList {
    public static void main(String[] args) {
        testLinkedList();
        System.out.println();
        testArrayList();
    }

    public static void testLinkedList() {
        MyList linked = new MyLinkedList();
        linked.add('a');
        linked.add('b');
        linked.add('d');
        System.out.println("Linked List: ");
        System.out.println("Size: " + linked.size());
        System.out.println(linked);
        linked.remove(2);
        System.out.println("After remove index: ");
        System.out.println("Size: " + linked.size());
        System.out.println(linked);
        System.out.println("Add 30 at index 0: ");
        linked.add(30,0);
        System.out.println(linked);
    }

    public static void testArrayList() {
        MyList list = new MyArrayList();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('c', 0);
        System.out.println("Array List: ");
        System.out.println("Size: " + list.size());
        System.out.println(list);
        list.remove(1);
        System.out.println("After remove index 1: ");
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println("Add");
        list.add(44, 3);
        System.out.println(list);
    }
}
