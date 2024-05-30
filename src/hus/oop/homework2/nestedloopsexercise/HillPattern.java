package hus.oop.homework2.nestedloopsexercise;

public class HillPattern {
    public static void main(String[] args) {
        int size = 5;
        printHillPatternA(size);
        printHillPatternB(size);
    }
    public static void printHillPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row + col >= size + 1)) {

                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printHillPatternB(int size){
        for(int row = 1; row<= size; row++){
            for(int col = 1; col <=size;col++){
                if((row + col <= size + 1)){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            for(int col = 2; col <= size; col++){
                if(row <= col){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void printHillPatternC(int size){

    }
    public static void printHillPatternD(int size){

    }
}
