package hus.oop.lab7.movablepointandcircle;

public class Test {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(12, 30, 2, 2);
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);

        MovablePoint movablePoint = (MovablePoint) movable1;
        movablePoint.moveUp();
        System.out.println(movablePoint);
        System.out.println("XSpeed = " + movablePoint.xSpeed);
        System.out.println("YSpeed = " + movablePoint.ySpeed);

        MovableCircle movableCircle = new MovableCircle(2, 5, 7, 3, 5);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);

    }
}
