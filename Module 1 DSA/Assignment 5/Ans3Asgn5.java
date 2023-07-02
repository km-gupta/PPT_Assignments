import java.util.Arrays;

public class Ans3Asgn5 {
    private static void squareInNonDecreasingOrder(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        Arrays.sort(arr);
    }
    private static void print1DArray(int[] arr) {
        System.out.print("[ ");
        for(int a: arr) {
            System.out.print(a+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        squareInNonDecreasingOrder(arr);
        print1DArray(arr);
    }
}
