public class Ans_3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 2, 3, 7};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            int temp1 =1; int temp2 =1;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] == arr[i]+1 || arr[j] == arr[i]) {
                    temp1++;
                } 
            }
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] == arr[i]-1 || arr[j] == arr[i]) {
                    temp2++;
                } 
            }
            if(temp1 > sum) {
                sum = temp1;
            } else if(temp2 > sum) {
                sum = temp2;
            }
        }
        System.out.println("Longest harmonic subsequence length is "+sum);        
    }
}
