package hus.oop.lab9.mylist;

public class MyLinkedList extends MyAbstractList {

    private int size;
    private MyLinkedListNode head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getMyLinkedNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getMyLinkedNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        if (index == 0) {
            if (this.size == 1) {
                this.head = null;
            } else {
                this.head = getMyLinkedNodeByIndex(1);
            }
            size--;
            return;
        }
        if (index == this.size - 1) {
            MyLinkedListNode prevLastNode = getMyLinkedNodeByIndex(index - 1);
            prevLastNode.setNext(null);
            size--;
            return;
        }
        MyLinkedListNode nodeBeforeTarget = getMyLinkedNodeByIndex(index - 1);
        MyLinkedListNode target = getMyLinkedNodeByIndex(index);
        nodeBeforeTarget.setNext(target.getNext());
        size--;
    }

    @Override
    public Object get(int index) {
        MyLinkedListNode target = getMyLinkedNodeByIndex(index);
        return target.getPayload();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
