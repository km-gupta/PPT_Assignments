public class Ans5Asgn8 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int count = 0;
        int temp = 1;
        StringBuilder st = new StringBuilder();
        st.append(chars[0]);
        for(int i=1; i<chars.length; i++) {
            if(chars[i] != chars[i-1]) {
                st.append(temp);
                st.append(chars[i]);
                count += temp;
                temp = 0;
            } else temp++;
        }
        System.out.println(count);
        System.out.println(st);
    }
}
