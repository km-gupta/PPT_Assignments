public class Ans3Asgn6 {
    private static boolean validMountainArray(int[] arr) {
        int i = 0;
        boolean flag = false;

        while(i<arr.length-1) {
            if(arr[i] < arr[i+1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            i++;
        }
        while(i<arr.length-1) {
            if(arr[i] > arr[i+1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,2,1,0};
        System.out.println(validMountainArray(arr));
    }
}
