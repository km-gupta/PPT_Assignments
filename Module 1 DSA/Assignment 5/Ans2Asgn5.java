public class Ans2Asgn5 {
    private static int countStairCases(int coins) {
        int k=0;
        for(int i=1; i<=coins; i++) {
            k++;
            coins -= i;
        }
        return k;
    }
    public static void main(String[] args) {
        int coins = 5;
        System.out.println(countStairCases(coins));
    }    
}
