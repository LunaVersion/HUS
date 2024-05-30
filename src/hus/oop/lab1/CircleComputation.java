package hus.oop.lab1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double diameter;
        double circumference;
        double area;
        System.out.println("Enter the radius");
        radius = sc.nextDouble();

        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
    }
}
