public class Ans2Asgn6 {
    private static boolean targetPresent(int[][] matrix, int target) {
        int rowh = matrix.length-1, colh = matrix[0].length-1, rowl = 0, coll = 0;
        
        while(rowl <= rowh && coll < colh) {
            int rowmid = rowl + (rowh - rowl) / 2;
            int colmid = coll + (colh - coll) / 2;

            if(matrix[rowmid][colmid] == target) {
                return true;
            }
            if(matrix[rowmid][colmid] < target) {
                rowl = rowmid;
                coll = colmid+1;
            } else {
                rowh = rowmid;
                colh = colmid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = targetPresent(matrix, target);
        System.out.println(ans);
    }
}
