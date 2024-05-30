package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.Scanner;

public class ChangeCoins {
    private int[] A;
    private int T;

    public static int[] changeCoins(int[] A, int T){
        int[] S = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            S[i] = 0;
        }
        int i = 0;
        while (i < A.length && T>0){
            S[i] = T / A[i];
            T -= S[i] * A[i];
            i++;
        }
        if(T>0) return new int[]{-1};
        return S;
    }

    public static void print(int[] A){
        for (int j : A) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChangeCoins changeCoins = new ChangeCoins();
        System.out.print("Enter amount of money: ");
        changeCoins.T = sc.nextInt();
        System.out.println("Enter number of money: ");
        changeCoins.A = new int[5];
        for (int i = 0; i < changeCoins.A.length; i++) {
            changeCoins.A[i] = sc.nextInt();
        }
        print(changeCoins(changeCoins.A, changeCoins.T));
    }
}
