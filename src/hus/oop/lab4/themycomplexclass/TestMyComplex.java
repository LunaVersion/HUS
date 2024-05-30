package hus.oop.lab4.themycomplexclass;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double img1 = sc.nextDouble();
        MyComplex myComplex1 = new MyComplex();
        myComplex1.setImag(img1);
        myComplex1.setReal(real1);
        System.out.print("Enter the number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double img2 = sc.nextDouble();
        MyComplex myComplex2 = new MyComplex();
        myComplex2.setImag(img2);
        myComplex2.setReal(real2);

        String output1 = myComplex1.toString();
        String output2 = myComplex2.toString();

        System.out.println();

        System.out.println("Number 1 is: (" + output1 + ")");
        if(myComplex1.isReal()) {
            System.out.println(output1 + " is a pure real number");
        } System.out.println(output1 + " is NOT a pure real number");

        if(myComplex1.isImaginary()) {
            System.out.println(output1 + " is a pure imaginary number");
        } System.out.println(output1 + " is NOT a imaginary real number");

        System.out.println();

        System.out.println("Number 2 is: (" + output2 + ")");
        if(myComplex2.isReal()) {
            System.out.println(output2 + " is a pure real number");
        } System.out.println(output2 + " is NOT a pure real number");

        if(myComplex2.isImaginary()) {
            System.out.println(output2 + " is a pure imaginary number");
        } System.out.println(output2 + " is NOT a imaginary real number");

        System.out.println();
        if(myComplex1.equals(myComplex2)) {
            System.out.println(output1 + "is NOT equals to " + output2);
        } System.out.println(output1 + "is equals to " + output2);

        MyComplex myComplex3 = myComplex1.addInto(myComplex2);
        System.out.println(output1 + " + " + output2 + " = " + myComplex3.toString());
    }
}
