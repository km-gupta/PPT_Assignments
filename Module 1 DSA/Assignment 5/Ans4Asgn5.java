public class Ans4Asgn5 {
    private static void listOfDistinctInteger(int[] arr1, int[] arr2) {
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    arr1[i] = -1;
                    arr2[j] = -1;
                    break;
                }
            }
        }
    }
    private static void print1DArray(int[] arr) {
        System.out.print("[ ");
        for(int a: arr) {
            if(a < 0) continue;
            System.out.print(a+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 6};
        
        listOfDistinctInteger(arr1, arr2);
        print1DArray(arr1);
        print1DArray(arr2);
    }

    
}
