public class Ans_2 {
    
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int k =0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == val) {
                k++;
            }
        }
        System.out.println(k);
    }
}
