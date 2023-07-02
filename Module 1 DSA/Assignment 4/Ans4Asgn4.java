import java.util.Arrays;

public class Ans4Asgn4 {
    private static int maximizedPairSum(int[] arr) {
        int max = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length-3; i++) {
            int temp = Math.min(arr[i], arr[i+1]) + Math.min(arr[i+2], arr[i+3]);
            if(temp > max) max = temp;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        int max = maximizedPairSum(arr);
        System.out.println(max);
    }    
}
