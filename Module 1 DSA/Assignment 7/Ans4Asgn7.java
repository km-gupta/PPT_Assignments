class Ans4Asgn7 {
    private static void reverseWordInString(String s) {
        String[] words = s.split(" ");
        String reversedWords = "";
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedWords += reversedWord + " ";
        }
        System.out.println(reversedWords.trim());
    } 
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWordInString(s);
    }
}