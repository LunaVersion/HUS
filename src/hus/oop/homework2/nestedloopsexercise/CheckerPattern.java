package hus.oop.homework2.nestedloopsexercise;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckerPattern {
    public static void main(String[] args) {
        int size = 7;
        printChecker(size);
    }
    public static void printChecker(int size){
        for(int row =1; row <=size;row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2) != 0) {
                    if(col<=size-1){
                        System.out.print("# ");
                    }else{
                        System.out.print("#");
                    }
                }else{
                System.out.print(" #");}

            }
            if (row < size) {
                System.out.println();
            }
        }
    }
}
