package hus.oop.lab4;
import java.util.Scanner;
public class GradeStatistics {
    public static void main(String[] args) {
        caculate(inputGrades());
    }
    public static Scanner sc = new Scanner(System.in);

    public static int[] inputGrades(){
        System.out.print("Enter the number of students: ");
        final int NUM_GRADES = sc.nextInt();
        int[] grades = new int[NUM_GRADES];
        if (grades.length > 0) {
            for(int i = 0; i < grades.length; i++){
                System.out.print("Enter ther grades for student " + (i+1) + ": ");
                grades[i] = sc.nextInt();
            }
        }
        return grades;
    }
    public static void caculate(int[] grades){
        double sum = 0;
        int min = grades[0];
        int max = grades[0];
        for (int i = 0; i < grades.length  ; i++){
            //sum
            sum = sum + grades[i];
            //min
            if(grades[i] < min){
                min = grades[i];
            }
            //max
            if(grades[i] > max){
                max = grades[i];
            }
        }
        double average = sum / grades.length;
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }


}
