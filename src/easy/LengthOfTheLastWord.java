package easy;

public class LengthOfTheLastWord {

    /**
     * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only.
     *
     * Example 1:
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     */

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}
