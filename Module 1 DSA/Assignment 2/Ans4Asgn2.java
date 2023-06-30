public class Ans4Asgn2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0};
        boolean flag = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                if(i==0) {
                    if(arr[i+1] != 1) {
                        flag = true;
                        break;
                    }
                } else if(i==arr.length-1) {
                    if(arr[i-1] != 1) {
                        flag = true;
                        break;
                    }
                } else {
                    if(arr[i-1] !=1 || arr[i+1] !=1) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
