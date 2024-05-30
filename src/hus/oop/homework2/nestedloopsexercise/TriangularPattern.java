package hus.oop.homework2.nestedloopsexercise;

public class TriangularPattern {
    public static void main(String[] args) {
        int size = 8;
        printTriangularPatternA(size);
        printTriangularPatternB(size);
        printTriangularPatternC(size);
        printTriangularPatternD(size);
    }
    public static void printTriangularPatternA(int size){
        for(int row =1; row <=size;row++) {
            for (int col = 1; col <= size; col++) {
                if(row>=col){
                    if(col<=size-1){
                        System.out.print("# ");
                    }else{
                        System.out.print("#");
                    }
                }
            }if (row < size) {
                System.out.println();
            }
        }

    }
    public static void printTriangularPatternB(int size){
        for(int row =1; row <=size;row++) {
            for (int col = 1; col <= size; col++) {
                if(row+col<=size+1){
                    if(col<=size-1){
                        if(col<=size-1) {
                            System.out.print("# ");
                        }else{
                            System.out.print("#");
                        }
                    }else{
                        System.out.print("#");
                    }
                }
            }if (row < size) {
                System.out.println();
            }
        }

    }
    public static void printTriangularPatternC(int size){
        for(int row =1; row <=size;row++) {
            for (int col = 1; col <= size; col++) {
                if(row<=col){
                    System.out.print("# ");
                }else{System.out.print("  ");}
            }if (row < size) {
                System.out.println();
            }
        }

    }
    public static void printTriangularPatternD(int size){
        for(int row =1; row <=size;row++) {
            for (int col = 1; col <= size; col++) {
                if(row+col>=size+1){
                    System.out.print("# ");
                }else{System.out.print("  ");}
            }if (row < size) {
                System.out.println();
            }
        }

    }
}
