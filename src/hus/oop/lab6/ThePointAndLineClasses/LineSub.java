package hus.oop.lab6.ThePointAndLineClasses;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "end=" + end +
                '}';
    }

    public Point getBegin() {
        return getBegin();
    }

    public void setBegin(Point begin) {
        setBegin(begin);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        setBeginX(beginX);
    }

    public void setBeginY(int beginY) {
        setBeginY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setBeginXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        return Math.sqrt((getEndX() - getBeginX()) * (getEndX() - getBeginX()) + (getEndY() - getBeginY()) * (getEndY() - getBeginY()));
    }

    public double getGradient() {
        return Math.atan2(getEndX() - getBeginX(), getEndY() - getBeginY());
    }
}
