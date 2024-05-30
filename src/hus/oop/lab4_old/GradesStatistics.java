package hus.oop.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        print(grades);
        System.out.println("\nThe average is: " + average(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The standard deviation is: " + standardDeviation(grades));

    }

    //Prompt user for the number of student and allocate the static "grades" array.
    //Then, prompt user for grade , check for valid grade , and store int "grades"
    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudent = sc.nextInt();
        grades = new int[numOfStudent];

        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        for (int i = 0; i < numOfStudent; i++) {
            while (grades[i] > 100 || grades[i] < 0) {
                System.out.println("The grade for student " + (i + 1) + " is invalid!");
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grades[i] = sc.nextInt();
            }
        }
    }

    // Print the given int array in the form of [ x1 , x2 , x3 , . . . , xn ] .
    public static void print(int[] arr) {
        System.out.print("The grades are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.print("]");
    }

    //Return the average value of int[]
    public static double average(int[] arr) {
        if ((arr == null) || (arr.length == 0)) {
            return 0;
        }
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum * 1.0 / arr.length;
        return average;
    }

    //Median is center element of the odd array or average of 2 middle elements of the even array
    public static double median(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 1) {
            return array[array.length / 2];
        }
        int middleElement = array.length / 2;
        return ((double) array[middleElement - 1] + array[middleElement]) / 2;
    }

    //Return the min value of int[]
    public static int min(int[] arr) {
        if ((arr == null) || (arr.length == 0)) {
            return 0;
        }

        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    //Return the max value of int[]
    public static int max(int[] arr) {
        if ((arr == null) || (arr.length == 0)) {
            return 0;
        }

        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    public static double standardDeviation(int[] arr) {
        double sum = 0.0;
        double standardDeviation = 0.0;
        int length = arr.length;

        for (double num : arr) {
            sum += num;
        }

        double mean = sum / length;

        for (double num : arr) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }
}


