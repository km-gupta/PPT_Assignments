import java.util.Arrays;

public class Ans5Asgn6 {
    private static int minimumProductSum(int[] arr1, int[] arr2) {
        int product = 0;
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<n; i++) {
            product += arr1[i] * arr2[n-i-1];
        }
        return product;
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 2};
        int[] arr2 = {4, 2, 2, 5};
        int product = minimumProductSum(arr1, arr2);
        System.out.println(product);
    }
}
