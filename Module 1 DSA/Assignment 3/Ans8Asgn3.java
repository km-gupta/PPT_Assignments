public class Ans8Asgn3 {
    private static boolean attendAllMeetings(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<row-1; i++) {
            if(arr[i][col-1] >= arr[i+1][0]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{0, 2}, {5, 10}, {15, 20}};
        System.out.println(attendAllMeetings(arr));
    }
}
