import java.util.ArrayList;

public class Ans6Asgn6 {
    private static Object[] checkDoubledArray(int[] arr1) {
        int n = arr1.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n/2; i++) {
            if(arr1[i]*2 == arr1[i+n/2]) {
                arr.add(arr1[i]);
            }
        }
        return arr.toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 6, 8};
        Object[] result = checkDoubledArray(arr1);
        for(Object r : result) {
            System.out.print(r+" ");
        }
    }
}
