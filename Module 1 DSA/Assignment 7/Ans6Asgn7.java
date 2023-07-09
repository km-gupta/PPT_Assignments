public class Ans6Asgn7 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        int k = goal.indexOf(s.charAt(0));
        
        StringBuilder st = new StringBuilder();
        st.append(goal.substring(k, goal.length()));
        st.append(goal.substring(0, k));
        
        if(s.equals(st.toString())) System.out.println(true);
        else System.out.println(false);
    }
}
