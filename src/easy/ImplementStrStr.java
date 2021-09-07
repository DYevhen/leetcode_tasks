package easy;

public class ImplementStrStr {
    /**
     * Return index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("hello", "rr"));
        System.out.println(strStr("hello", ""));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
