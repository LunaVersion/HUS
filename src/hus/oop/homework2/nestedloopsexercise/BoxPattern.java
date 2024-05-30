package hus.oop.homework2.nestedloopsexercise;

import java.sql.SQLOutput;

public class BoxPattern {
    public static void main(String[] args) {
        int size = 8;
        printBoxPatternA(size);
        printBoxPatternB(size);
        printBoxPatternC(size);
        printBoxPatternD(size);
    }
    public static void printBoxPatternA(int size){
        for(int row = 1; row<=size;row++){
            for(int col = 1; col <=size; col++){
                if(row==1||row==size||col==1||col==size){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void printBoxPatternB(int size){
        for(int row = 1; row<=size;row++){
            for(int col = 1; col <=size; col++){
                if(row==1||row==size||row==col){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void printBoxPatternC(int size){
        for(int row = 1; row<=size;row++){
            for(int col = 1; col <=size; col++){
                if(row==1||row==size||row==size-col+1){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void printBoxPatternD(int size){
        for(int row = 1; row<=size;row++){
            for(int col = 1; col <=size; col++){
                if(row==1||row==size||row==size-col+1||row==col){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
