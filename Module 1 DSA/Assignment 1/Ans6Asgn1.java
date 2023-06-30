import java.util.Arrays;

public class Ans6Asgn1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean flag = false;
        int idx = 0;
        Arrays.sort(arr);
        while(idx < arr.length-1) {
            if(arr[idx] == arr[idx+1]) {
                flag = true;
                break;
            }
            idx++;
        }
        System.out.println(flag);
    }
}
