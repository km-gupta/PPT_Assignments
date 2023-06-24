public class Ans_7 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 6, 1,0};
        int i = 0;
        int j = 0;

        while(j<arr.length) {
            if(arr[i] > 0) {
                i++;
                j++;
            } else {
                if(arr[j] > 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
        }
        for(int ar: arr) {
            System.out.print(ar+" ");
        }
    }
}
