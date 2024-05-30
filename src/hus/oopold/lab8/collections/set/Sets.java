package hus.oopold.lab8.collections.set;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersectionList = new HashSet<>();
        for(Integer firstElement: first){
            if(second.contains(firstElement)){
                intersectionList.add(firstElement);
            }
        }
        return intersectionList;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> unionManualList = new HashSet<>();
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
        // Tạo một bản sao của tập hợp đầu tiên
        Set<Integer> intersectionList = new HashSet<>(first);
        // Thực hiện phép giao với tập hợp thứ hai
        intersectionList.retainAll(second);
        // Trả về kết quả
        return intersectionList;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> unionList = new HashSet<>();
        for(Integer firstElement: first){
            unionList.addAll(first);
        }
        for(Integer secondElement: second){
            unionList.addAll(second);
        }
        return unionList;
    }
    public static List<Integer> toList(Set<Integer> source){
        return new ArrayList<>(source);
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
        // Tạo một HashSet để lưu trữ các phần tử đã xuất hiện
        Set<Integer> seen = new HashSet<>();
        // Tạo một danh sách mới để lưu trữ các phần tử không trùng lặp
        List<Integer> result = new ArrayList<>();
        // Duyệt qua danh sách nguồn
        for (Integer element : source) {
            // Nếu phần tử chưa được thêm vào HashSet, thêm vào danh sách kết quả và HashSet
            if (!seen.contains(element)) {
                result.add(element);
                seen.add(element);
            }
        }
        return result;
    }
    public static String firstRecurringCharacter(String s){
        List<Character> list = new ArrayList<>();
        for (char character : s.toCharArray()){
            if(list.contains(character)){
                System.out.println(character);
            }
            else {
                list.add(character);
            }
        }
        return s;
    }
    public static Set<Character> allRecurringChars(String s) {
        List<Character> tempList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            tempList.add(s.charAt(i));
        }
        return new HashSet<>(tempList);
    }
    public static Integer[] toArray(Set<Integer> source) {
        // Tạo một mảng Integer với kích thước của tập hợp
        Integer[] array = new Integer[source.size()];
        // Sao chép các phần tử từ tập hợp vào mảng
        source.toArray(array);
        // Trả về mảng Integer
        return array;
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
