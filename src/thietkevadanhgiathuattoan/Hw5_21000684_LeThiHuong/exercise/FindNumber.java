package thietkevadanhgiathuattoan.Hw5_21000684_LeThiHuong.exercise;

import java.util.Random;

/*
Bài toán: Tìm vị trí của phần tử lớn thứ k
 */
public class FindNumber {
    static int RandomPartition(int[] arr, int left, int right) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(right - left + 1) + left;
        swap(arr, pivotIndex, right);
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int FindKthLargest(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        } else {
            int pivotIndex = RandomPartition(arr, left, right);
            int count = right - pivotIndex + 1;
            if (count == k) {
                return arr[pivotIndex];
            } else if (count > k) {
                return FindKthLargest(arr, pivotIndex + 1, right, k);
            } else {
                return FindKthLargest(arr, left, pivotIndex - 1, k - count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = FindKthLargest(arr, 0, arr.length - 1, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
