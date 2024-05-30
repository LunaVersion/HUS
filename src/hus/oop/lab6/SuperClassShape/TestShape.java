package hus.oop.lab6.SuperClassShape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor("Red");
        shape.setFilled(true);
        shape.isFilled();
        System.out.println(shape.toString());

        Shape rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setFilled(false);
        rectangle.isFilled();
        System.out.println(rectangle.toString());

        Square square = new Square();
        square.setSide(5);
        square.setWidth(5);
        square.setLength(5);
        square.setColor("Green");
        System.out.println(square.toString());


    }
}
