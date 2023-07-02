public class Ans8Asgn4 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = arr.length;
        int[] result = new int[arr.length];
        
        for(int i=0; i<n; i++) {
            if(i%2 == 0) result[i] = arr[i/2];
            else result[i] = arr[i/2+n/2];
        }
        for(int ar: result) {
            System.out.print(ar+" ");
        }
    }
}
