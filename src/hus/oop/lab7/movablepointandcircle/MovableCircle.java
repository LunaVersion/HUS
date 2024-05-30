package hus.oop.lab7.movablepointandcircle;

public class MovableCircle implements Movable  {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public void moveUp(){
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public void moveRight() {
        center.x -= center.xSpeed;
    }
    public String toString(){
       return "(x, y) speed = (" + center.x + ", " + center.y + "), radius =" + radius;
    }
}
