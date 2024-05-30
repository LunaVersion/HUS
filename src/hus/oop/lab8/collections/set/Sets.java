package hus.oop.lab8.collections.set;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second){
        Set intersectionList = new HashSet<Integer>();
        for(Integer firstElement: first){
            if(second.contains(firstElement)){
                intersectionList.add(firstElement);
            }
        }
        return intersectionList;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second){
        Set unionManualList = new HashSet<Integer>();
        for(Integer firstElement: first){
            unionManualList.addAll(first);
        }
        for(Integer secondElement: second) {
            unionManualList.addAll(second);
        }
        unionManualList.removeAll(intersectionManual(first, second));
        return unionManualList;
    }
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set intersectionList = new HashSet<Integer>();
        for(Integer firstElement: first){
            intersectionList.retainAll(first);
        }
        for(Integer secondElement: second){
            intersectionList.retainAll(second);
        }
        return intersectionList;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set unionList = new HashSet<Integer>();
        for(Integer firstElement: first){
            unionList.addAll(first);
        }
        for(Integer secondElement: second){
            unionList.addAll(second);
        }
        return unionList;
    }
    public static List<Integer> toList(Set<Integer> source){
        List toList = new ArrayList<Integer>();
        toList.addAll(source);
        return toList;
    }

    public static List<Integer> removeDuplicates(List<Integer> source){
        ArrayList<Integer> removeList = new ArrayList<Integer>();
        for(Integer element: source){
            if (!removeList.contains(element)){
                removeList.add(element);
            }
        }
        return removeList;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source){
        for(int i = 0; i < source.size(); i++){
            for(int j = 0; j < source.size(); j++){
                if(source.get(i) == source.get(j)){
                    source.remove(source.get(i));
                }
            }
        }
        return source;
    }
    public static String firstRecurringCharacter(String s){
        List<Character> list = new ArrayList<>();
        for (char charecter : s.toCharArray()){
            if(list.contains(charecter)){
                System.out.println(charecter);
            }
            else {
                list.add(charecter);
            }
        }
        return s;
    }
    public static Set<Character> allRecurringChars(String s) {
        List tempList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            tempList.add(s.charAt(i));
        }
        Set allRecurringCharacterList = new HashSet<Character>(tempList);
        return allRecurringCharacterList;
    }
    public static Integer[] toArray(Set<Integer> source) {
        int[] array;
        return (Integer[]) source.toArray();
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
