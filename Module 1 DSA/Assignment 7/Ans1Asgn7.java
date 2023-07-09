import java.util.HashMap;

public class Ans1Asgn7 {
    public static boolean isIsomorphic(String s, String t) {
        // Check if the strings have different lengths.
        if (s.length() != t.length()) {
            return false;
        }

        // Create a mapping between the characters in the two strings.
        HashMap<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If the character already exists in the mapping, check if it maps to the same character in the other string.
            if (charMap.containsKey(c1)) {
                if (charMap.get(c1) != c2) {
                    return false;
                }
            } else {
                // If the character does not exist in the mapping, add it with the current character as the value.
                charMap.put(c1, c2);
            }
        }

        // Check if all the characters in the second string have a mapping in the first string.
        for (int i = 0; i < t.length(); i++) {
            if (!charMap.containsKey(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t)); // true
    }
}
