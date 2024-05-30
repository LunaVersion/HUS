package hus.oop.lab4.thecircleclass;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of" + circle1.getRadius()+"and area of "+ circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of" + circle2.getRadius()+"and area of "+ circle2.getArea());
    }
}
