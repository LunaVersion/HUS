package hus.oop.lab8.collections.list;
import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value){
        list.add(0, value);
    }
    public static void insertLast(List<Integer> list, int value){
        list.add(list.size(), value);
    }
    public static void replace(List<Integer> list, int value){
        list.set(3, value);
    }
    public static void removeThird(List<Integer> list){
        list.remove(3);
    }
    public static void removeEvil(List<Integer> list){
        if(list.indexOf(666) != -1){
            list.remove(list.indexOf(666));
        }
    }
    public static List<Integer> generateSquare(){
        int counter = 0;
        List generate = new ArrayList<Integer>();
        while (generate.size() < 10){
            counter++;
            generate.add(counter * counter);
        }
        return generate;
    }
    public static boolean contains(List<Integer> list, int value){
        return list.contains(value);
    }
    public static void copy(List<Integer> source, List<Integer> target){
        target.clear();
        target.addAll(source);
    }
    public static void reverseManual(List<Integer> list){
        List reverseManual = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            reverseManual.add(list.get(list.size() - i -1));
        }
        copy(reverseManual, list);
    }
    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.addFirst(value);
        list.addLast(value);
    }
}
