package hus.oop.lab6.TheCircleAndCylinderUsingComposition;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(4.44);
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3.33);
        System.out.println(cylinder.toString());
        cylinder.setBase(circle);
        cylinder.setHeight(6.66);
        System.out.println(cylinder.toString());
    }
}
