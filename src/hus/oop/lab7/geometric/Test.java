package hus.oop.lab7.geometric;


public class Test {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(4);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject);

        Circle circle = (Circle) geometricObject;
        System.out.println(circle);
        System.out.println(circle.getRadius());

        GeometricObject geometricObject1 = new Rectangle(3.0, 6.0);
        System.out.println(geometricObject1);
        geometricObject1.getArea();
        geometricObject1.getPerimeter();

        Rectangle rectangle = (Rectangle) geometricObject1;
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);
    }
}
