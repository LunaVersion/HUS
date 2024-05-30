package hus.oop.lap2;

public class SquarePattern {
    public static void main(String[] args) {
        int size = 3;
        printSquare(size);
    }
    public static void printSquare(int size){
        for (int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(col<=size-1){
                    System.out.print("# ");
                }else{
                    System.out.print("#");
                }
            }
            if(row<size) {
                System.out.println();
            }
        }
    }
    public static void printSquareUseWhile(int size, char myChar){
        int col = 0;
    }
}
