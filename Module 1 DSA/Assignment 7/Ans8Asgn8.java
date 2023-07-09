public class Ans8Asgn8 {
    public static void main(String[] args) {
        int[][] coordinates = {{1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}};
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[coordinates.length-1][0];
        int y2 = coordinates[coordinates.length-1][1];
        boolean point = true;

        for(int i=1; i<coordinates.length-1; i++) {
            int x = coordinates[i][0];
            int y = (y2-y1)/(x2-x1) * (x-x1) + y1;
            if( y != coordinates[i][1]) {
                point = false;
                break;
            }
        }
        System.out.println(point);
    }
}
