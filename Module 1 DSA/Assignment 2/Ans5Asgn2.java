public class Ans5Asgn2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0};
        int product = 0;

        for(int i=0; i<arr.length-2; i++) {
            int temp = 0;
            temp = arr[i]*arr[i+1]*arr[i+2];

            if(temp > product) product = temp;
        }
        System.out.println("Maximum product of three number: "+product);
    }    
}
