package thietkevadanhgiathuattoan.Hw5_21000684_LeThiHuong.exercise;
/*
Bài toán: Tính tổng các phần tử trong một list các list số nguyên
 */
import java.util.ArrayList;
import java.util.List;

public class SumOfList {
    static int sumOfLists(List<List<Integer>> listOfLists) {
        if (listOfLists.isEmpty()) {
            return 0;
        }

        // Trường hợp cơ sở: Danh sách chỉ chứa một danh sách
        if (listOfLists.size() == 1) {
            return sumOfList(listOfLists.get(0));
        }

        // Chia danh sách thành hai phần
        int mid = listOfLists.size() / 2;
        List<List<Integer>> leftHalf = listOfLists.subList(0, mid);
        List<List<Integer>> rightHalf = listOfLists.subList(mid, listOfLists.size());

        return sumOfLists(leftHalf) + sumOfLists(rightHalf);
    }

    static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(List.of(1, 2, 3));
        listOfLists.add(List.of(4, 5));
        listOfLists.add(List.of(6, 7, 8));

        int totalSum = sumOfLists(listOfLists);
        System.out.println("Tổng của danh sách các danh sách là: " + totalSum);
    }
}

