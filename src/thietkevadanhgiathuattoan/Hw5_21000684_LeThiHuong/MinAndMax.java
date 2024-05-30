package thietkevadanhgiathuattoan.Hw5_21000684_LeThiHuong;

public class MinAndMax {
    public static int findMin(int[] arr,int low, int high){
        if(low == high) return arr[low];
        else if(high - low == 1) return Math.min(arr[low], arr[high]);
        else {
            int mid = (low + high) / 2;

            int leftPair = findMin(arr, low, mid);
            int rightPair = findMin(arr, mid + 1, high);

            return Math.min(leftPair, rightPair);
        }
    }
    public static int findMax(int[] arr,int low, int high){
        if(low == high) return arr[low];
        else if(high - low == 1) return Math.max(arr[low], arr[high]);
        else {
            int mid = (low + high) / 2;

            int leftPair = findMax(arr, low, mid);
            int rightPair = findMax(arr, mid + 1, high);

            return Math.max(leftPair, rightPair);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,4,7,3,6,7};
        int min = findMin(arr, 0,arr.length - 1);
        int max = findMax(arr, 0,arr.length - 1);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
