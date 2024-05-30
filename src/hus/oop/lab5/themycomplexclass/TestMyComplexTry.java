package hus.oop.lab5.themycomplexclass;

public class TestMyComplexTry {
    public static void main(String[] args) {
        MyComplexTry myComplexTry1 = new MyComplexTry();
        myComplexTry1.setValue(1.1, 2.2);
        System.out.println(myComplexTry1.toString());
        myComplexTry1.equals(4.3,5.5);
        myComplexTry1.add(new MyComplexTry(3.3,4.4));
        System.out.println(myComplexTry1.toString());
    }
}
