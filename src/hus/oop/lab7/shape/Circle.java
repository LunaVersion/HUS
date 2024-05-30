package hus.oop.lab7.shape;


public class Circle extends Shape {
    protected double radius = 1.0;

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public Circle(){
        super();
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ", radius=" + radius +
                '}';
    }
}
