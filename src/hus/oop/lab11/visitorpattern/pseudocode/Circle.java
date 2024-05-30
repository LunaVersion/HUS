package hus.oop.lab11.visitorpattern.pseudocode;

public class Circle implements Shape{
    private int radius;
    private int id;
    private int x;
    private int y;

    public Circle(int radius, int id, int x, int y) {
        this.radius = radius;
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor v) {
        return v.visitCircle(this);
    }


}
