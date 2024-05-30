package hus.oop.lab7.resizableandgeometricobject;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(5.5);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        Circle circle = (Circle) geometricObject;
        System.out.println("Radius = " + circle.radius);
        System.out.println(circle);
    }
}
