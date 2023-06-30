import java.util.Arrays;

public class Ans6Asgn3 {
    private static int elementAppearsOnes(int[] arr) {
        int ele = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i= i+2) {
            if(i != arr.length-1) {
                if(arr[i] != arr[i+1]) {
                    return arr[i];
                }
            } else {
                if(arr[i] != arr[i-1]) {
                    return arr[i];
                }
            }
            
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1};
        int ele = elementAppearsOnes(arr);
        System.out.println(ele);
    }
    

}
