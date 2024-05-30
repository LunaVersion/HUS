package hus.oop.lab7.geometric;

public class Rectangle implements GeometricObject{
    private double width ;
    private double length ;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){
        return 2 * (width + length);
    }
    public double getPerimeter(){
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
