public class Ans2Asgn2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int sum = 0;
        int temp = arr[0];
        boolean flag = false;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == temp && flag == true) {
                sum += temp;
                temp = arr[i];
                flag = false;
            } else {
                flag = true;
                temp = arr[i];
            }
        }
        System.out.println("Alice can only eat "+ sum/2 +" candies.");
    }
}
