package hus.oopold.lab8.collections.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Test {
    public static void main(String[] args) {
        // Test intersectionManual method
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("Manual Intersection: " + Sets.intersectionManual(set1, set2));

        // Test unionManual method
        System.out.println("Manual Union: " + Sets.unionManual(set1, set2));

        // Test intersection method
        System.out.println("Intersection: " + Sets.intersection(set1, set2));

        // Test union method
        System.out.println("Union: " + Sets.union(set1, set2));

        // Test toList method
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 4, 5, 5));
        List<Integer> list1 = Sets.toList(set3);
        System.out.println("List from set: " + list1);

        // Test removeDuplicates method
        List<Integer> list2 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("List with duplicates: " + list2);
        List<Integer> uniqueList = Sets.removeDuplicates(list2);
        System.out.println("List without duplicates: " + uniqueList);

        // Test removeDuplicatesManual method
        List<Integer> list3 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("List with duplicates: " + list3);
        List<Integer> uniqueListManual = Sets.removeDuplicatesManual(list3);
        System.out.println("List without duplicates (manual): " + uniqueListManual);

        // Test firstRecurringCharacter method
        String str = "hello";
        System.out.println("First recurring character in '" + str + "': " + Sets.firstRecurringCharacter(str));

        // Test allRecurringChars method
        String str2 = "hello";
        System.out.println("All recurring characters in '" + str2 + "': " + Sets.allRecurringChars(str2));

        // Test toArray method
        Set<Integer> set4 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] array = Sets.toArray(set4);
        System.out.println("Array from set: " + Arrays.toString(array));

        // Test getFirst method
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("First element in TreeSet: " + Sets.getFirst(treeSet));

        // Test getLast method
        System.out.println("Last element in TreeSet: " + Sets.getLast(treeSet));

        // Test getGreater method
        System.out.println("Greater than 3 in TreeSet: " + Sets.getGreater(treeSet, 3));

    }
}
