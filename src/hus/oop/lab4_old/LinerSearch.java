package hus.oop.lab4_old;
import java.util.Scanner;
public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key that you wanna find: ");
        int key = sc.nextInt();
        System.out.println(linerSearch(array, key));
        System.out.println(linearSearchIndex(array, key));
    }
    public static boolean linerSearch(int[] array, int key){
        for(int i =0; i < array.length; i++){
            if(array[i] == key){
                return true;
            }

        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key){
        for(int i =0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }

        }
        return -1;
    }

}
