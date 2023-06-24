public class Ans_8 {
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4};
        int[] result = new int[2];

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                if(arr[i] == i+1) {
                    result[0] = arr[i];
                    result[1] = arr[i] + 1;
                } else {
                    result[0] = arr[i+1];
                    result[1] = arr[i+1] - 1;
                }
            }
        }
        for(int re: result) {
            System.out.print(re+ " ");
        }
    }
}
