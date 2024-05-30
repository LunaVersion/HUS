package hus.oop.lab9.mylist;

public class MyArrayList extends MyAbstractList {

    private static final int INITIAL_SIZE = 16;
    private int size;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        checkBoundaries(index, size);
        for (int i = this.size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
