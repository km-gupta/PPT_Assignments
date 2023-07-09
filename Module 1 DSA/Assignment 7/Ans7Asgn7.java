public class Ans7Asgn7 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '#') count--;
            count++;
        }
        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) == '#') count++;
            count--;
        }
        if(count == 0) System.out.println(true);
        else System.out.println(false);
    }
}
