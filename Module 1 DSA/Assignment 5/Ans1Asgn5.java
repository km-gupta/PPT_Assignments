public class Ans1Asgn5 {
    private static int[][] convert1DInto2DArrays(int[] arr, int m, int n) {
        int[][] result = new int[m][n];
        int l = arr.length;
        int row = 0, col = 0; 
        if(m*n <= l) {
            for(int i=0; i<l; i++) {
                if(row < m && col < n) {
                    result[row][col++] = arr[i];
                } else {
                    row++;
                    col = 0;
                    i--;
                }
            }
        }
        return result;
    }
    private static void print2DArray(int[][] result) {
        for(int ar[]: result) {
            System.out.print("[ ");
            for(int a: ar) {
                System.out.print(a+" ");
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = convert1DInto2DArrays(arr, m, n);
        print2DArray(result);
    }
}
