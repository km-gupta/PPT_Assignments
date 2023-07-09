public class Ans5Asgn {
    public static String reverseStr(String s, int k) {
        StringBuilder reversedString = new StringBuilder();
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (i % k == 0 && n-i > k) {
                reversedString.append(new StringBuilder(s.substring(i, i + k)).reverse());
                i += k;
            } else {
                reversedString.append(s.charAt(i));
                if(n-i < k) i++;
            }
            
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String reversedString = reverseStr(s, k);
        System.out.println(reversedString);
    }
}
