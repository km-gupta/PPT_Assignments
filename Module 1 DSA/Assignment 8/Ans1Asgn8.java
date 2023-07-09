public class Ans1Asgn8 {
    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";
        int sum = 0;

        for(int i=0; i<s1.length(); i++) {
            if(s2.contains(s1.substring(i, i+1))){
                continue;
            } else {
                sum += s1.charAt(i);
            }
        }
        for(int i=0; i<s2.length(); i++) {
            if(s1.contains(s2.substring(i, i+1))){
                continue;
            } else {
                sum += s2.charAt(i);
                
            }
        }
        System.out.println(sum);
    }
}
