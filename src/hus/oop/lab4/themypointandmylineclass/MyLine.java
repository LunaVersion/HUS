package hus.oop.lab4.themypointandmylineclass;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }

    public int[] getBeginXY(){
        int[] beginXY = new int[2];
        beginXY[0] = getBeginX();
        beginXY[1] = getBeginY();
        return beginXY;
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }
    public int[] getEndXY(){
        int[] endXY = new int[2];
        endXY[0] = getEndY();
        endXY[1] = getEndY();
        return endXY;
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    public double getLength(){
        return Math.sqrt(Math.pow(getBeginX()-getEndX(),2)+Math.pow(getBeginY()-getEndY(),2));
    }
    public double getGradient(){
        return Math.atan2(getEndY()-getBeginY(), getEndX()-getBeginX());
    }

    public String toString(){
        return "MyLine[begin=(" + getBeginX() + ", " + getBeginY() + "), end=(" + getEndX() + ", " + getEndY() + ")]";
    }
}
