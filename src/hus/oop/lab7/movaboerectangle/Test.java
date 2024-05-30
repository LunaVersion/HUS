package hus.oop.lab7.movaboerectangle;

public class Test {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(5, 6, 7, 8);
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println("Down: " + movable1);

        System.out.println();

        Movable movable2 = new MovableRectangle(3, 6, 8, 7, 1, 1);
        System.out.println(movable2);
        movable2.moveUp();
        System.out.println("Up: " + movable2);

        MovableRectangle movableRectangle = (MovableRectangle) movable2;
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        System.out.println("Down: " + movableRectangle);
    }
}
