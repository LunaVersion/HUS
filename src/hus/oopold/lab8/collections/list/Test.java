package hus.oopold.lab8.collections.list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        // Test insertFirst method
        List<Integer> list1 = new ArrayList<>();
        Lists.insertFirst(list1, 5);
        System.out.println("After insertFirst: " + list1);

        // Test insertLast method
        List<Integer> list2 = new ArrayList<>();
        Lists.insertLast(list2, 10);
        System.out.println("After insertLast: " + list2);

        // Test replace method
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        Lists.replace(list3, 99);
        System.out.println("After replace: " + list3);

        // Test removeThird method
        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        Lists.removeThird(list4);
        System.out.println("After removeThird: " + list4);

        // Test removeEvil method
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(666);
        list5.add(2);
        Lists.removeEvil(list5);
        System.out.println("After removeEvil: " + list5);

        // Test generateSquare method
        List<Integer> squares = Lists.generateSquare();
        System.out.println("Generated squares: " + squares);

        // Test contains method
        List<Integer> list6 = new ArrayList<>();
        list6.add(1);
        list6.add(2);
        list6.add(3);
        System.out.println("Contains 2? " + Lists.contains(list6, 2));

        // Test copy method
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        List<Integer> targetList = new ArrayList<>();
        Lists.copy(sourceList, targetList);
        System.out.println("Copied list: " + targetList);

        // Test reverse method
        List<Integer> list7 = new ArrayList<>();
        list7.add(1);
        list7.add(2);
        list7.add(3);
        Lists.reverse(list7);
        System.out.println("After reverse: " + list7);

        // Test reverseManual method
        List<Integer> list8 = new ArrayList<>();
        list8.add(1);
        list8.add(2);
        list8.add(3);
        Lists.reverseManual(list8);
        System.out.println("After reverseManual: " + list8);

        // Test insertBeginningEnd method (for LinkedList)
        LinkedList<Integer> linkedList = new LinkedList<>();
        Lists.insertBeginningEnd(linkedList, 10);
        System.out.println("After insertBeginningEnd: " + linkedList);
    }
}
