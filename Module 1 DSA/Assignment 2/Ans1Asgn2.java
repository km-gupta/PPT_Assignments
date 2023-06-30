import java.util.Arrays;

public class Ans1Asgn2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 2};
        int max = 0;

        Arrays.sort(arr);

        for(int i=0; i<arr.length-3; i++) {
            int temp = Math.min(arr[i], arr[i+1]) + Math.min(arr[i+2], arr[i+3]);
            if(temp > max) max = temp;
        }
        System.out.println("Maximized sum "+max);
    }    
}
