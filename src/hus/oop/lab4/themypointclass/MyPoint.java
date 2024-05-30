package hus.oop.lab4.themypointclass;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x=" + x + ", y=" + y + ')';
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(MyPoint another){
        return Math.sqrt((this.x-another.x)*(this.x-another.x)  + (this.y-another.y)*(this.y-another.y));
    }
    public double diatance(){
        return Math.sqrt(x*x + y*y);
    }
}
