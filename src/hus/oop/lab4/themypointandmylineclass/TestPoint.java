package hus.oop.lab4.themypointandmylineclass;

import jdk.swing.interop.SwingInterOpUtils;

public class TestPoint {
    public static void main(String[] args) {
        MyLine line = new MyLine(1,2,3,4);
        System.out.println(line);
        System.out.println(line.getBeginY());
        System.out.println(line.getBeginXY());
        System.out.println(line.getGradient());
        System.out.println(line.getLength());
    }
}
