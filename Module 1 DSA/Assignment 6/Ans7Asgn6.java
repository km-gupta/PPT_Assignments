public class Ans7Asgn6 {
    private static int[][] filledSpiralOrder(int[][] arr, int n) {
        int row = 0, col = 0, rowMin = 1, rowMax = n-1, colMin = 0, colMax = n-1;
        int value = 1;
        while(rowMin<=rowMax || colMin <= colMax) {
            while(col <= colMax) {
                arr[row][col++] = value++;
            } colMax--;
            col--;
            row++;

            while(row <= rowMax) {
                arr[row++][col] = value++;
            } rowMax--;
            row--;
            col--;

            while(col >= colMin) {
                arr[row][col--] = value++;
            } colMin++;
            col++;
            row--;
            
            while(row >= rowMin) {
                arr[row--][col] = value++;
            } rowMin++;
            row++;
            col++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        filledSpiralOrder(arr, n);
        for(int ar[] : arr) {
            System.out.print("[ ");
            for(int a : ar) {
                System.out.print(a+" ");
            }
            System.out.print("]");
        }
        
    }
}
