public class Ans_3 {
    private static int targetIndex(int[] arr, int l, int h, int target) {
        int mid = l+(h-l)/2;

        if(l>=h) return -1;
        //Base Codition
        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return targetIndex(arr, l, mid-1, target);
        } else {
            return targetIndex(arr, mid+1, h, target);
        }
    }
    public static void main(String[] args) {
        int[] arr= {1, 3, 5, 6};
        int target =9;

        int index = targetIndex(arr, 0, arr.length-1, target);
        System.out.println(index);
    }
}
