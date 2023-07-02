public class Ans5Asgn5 {
    private static int distanceBetweenElements(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(d >= Math.abs(arr1[i] - arr2[j])) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        int count = distanceBetweenElements(arr1, arr2, d);
        System.out.println(count);
    }
}
