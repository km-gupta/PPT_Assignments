public class Ans_7 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 2, 2, 1};
        boolean monotonic = false;
        
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        monotonic = false;
                        System.out.println(monotonic);
                        return;
                    } 
                }
                monotonic = true;
            } else if(arr[i] >= arr[i+1]) {
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[i] < arr[j]) {
                        monotonic = false;
                        System.out.println(monotonic);
                        return;
                    } 
                }
                monotonic = true;
            }  
        } 
        System.out.println(monotonic);
    }
}
