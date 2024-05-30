package hus.oop.lab6.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f,4.0f);
        System.out.println(point2D.toString());
        point2D.setXY(2.0f,5.5f);
        System.out.println("Point 2D;");
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 4.4f);
        System.out.println("Point 3D");
        System.out.println(point3D.toString());
    }
}
