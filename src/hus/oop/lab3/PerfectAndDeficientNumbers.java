package hus.oop.lab3;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        System.out.println("These numbers are perfect: ");
        int countPerfect = 0;
        for (int i = 1; i <= upperBound; i++) {
            if(isPerfect(i)){
                System.out.print(i + " ");
                countPerfect ++;
            }
        }
        System.out.println();
        System.out.println("[ "+countPerfect + " perfect numbers found (" + countPerfect*100.0/upperBound +"%) ]");

        System.out.println("These numbers are neither deficient and not perfect: ");
        int countDeficient = 0;
        for (int i = 1; i <= upperBound; i++) {
            if(!isDeficient(i) && !isPerfect(i)) {
                System.out.print(i + " ");
                countDeficient++;
            }
        }
        System.out.println();
        System.out.println("[ "+countDeficient + " perfect numbers found (" + (countDeficient*100.0/upperBound) +"%) ]");
    }

    public static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum == n) return true;
        return false;
    }

    public static boolean isDeficient(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum < n) return true;
        return false;
    }
}
