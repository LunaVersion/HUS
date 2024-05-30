package hus.oop.lab9.mymap;

public class TestMap {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put(11, "Nicola");
        m.put(11, "Nicola");
        m.put(21, "Marzia");
        m.put(31, "Johnny");
        System.out.println(m.contains(11));
        System.out.println(m.contains(77));
        System.out.println(m.size());
        m.remove(134);
        System.out.println(m.contains(11));
        System.out.println(m.size());
        System.out.println(m);
    }
}
