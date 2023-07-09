public class Ans8Asgn6 {
    private static int[][] productOfMatrix(int[][] mat1, int[][] mat2) {
        int m = mat1.length, k = mat1[0].length, n = mat2[0].length ;
        int[][] result = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                for(int l=0; l<k; l++) {
                    result[i][j] += mat1[i][l] * mat2[l][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        int [][] product = productOfMatrix(mat1, mat2);
        for(int ar[] : product) {
            System.out.print("[ ");
            for(int a : ar) {
                System.out.print(a+" ");
            }
            System.out.print("]");
        }
    }
}
