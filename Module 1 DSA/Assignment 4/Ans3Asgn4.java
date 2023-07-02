public class Ans3Asgn4 {

    private static int[][] transposeOfMatrix(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for(int[] ar: arr) {
            System.out.print("[ ");
            for(int a: ar) {
                System.out.print(a+" ");
            }
            System.out.print("]");
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        arr = transposeOfMatrix(arr);
        printArray(arr);
    }

    
}
