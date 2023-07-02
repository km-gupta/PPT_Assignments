public class Ans5Asgn4 {

    private static int countStairCases(int coins) {
        int count=0;
        for(int i=1; i<=coins; i++) {
            count++;
            coins -= i;
        }
        return count;
    }
    public static void main(String[] args) {
        int coins = 6;
        System.out.println(countStairCases(coins));
    }    
}
