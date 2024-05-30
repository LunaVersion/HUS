package hus.oop.lab6.ThePointAndLineClasses;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println(point1);
        point1.setXY(50,100);
        System.out.println("New point: " + point1.toString());
        Point point2 = new Point(30,40);

        System.out.println();

        Line line = new Line(point1,point1);
        System.out.println(line.toString());
        System.out.println("Length of the line: "+line.getLength());
        line.setEnd(point2);
        System.out.println(line.toString());
        System.out.println("Length of the line: "+line.getLength());

        System.out.println();

        LineSub lineSub = new LineSub(10,20,30,40);
        System.out.println("Gradient of line sub:" + lineSub.getGradient());
    }
}
