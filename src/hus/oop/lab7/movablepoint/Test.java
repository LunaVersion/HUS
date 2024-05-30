package hus.oop.lab7.movablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 4, 1, 1);
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
