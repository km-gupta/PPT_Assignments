public class Ans2Asgn8 {
    public static void main(String[] args) {
        String s = "()";
        int count = 0;
        boolean flag = true;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ')' && count > 0) {
                count--;
            } else {
                flag = false;
                break;
            }

            if(c == '(') count++;
            if(i<s.length()-1 && c=='*' )
        }
    }
}
