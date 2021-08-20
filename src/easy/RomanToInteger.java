package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RomanToInteger {
    /**
     * For example, 2 is written as II in Roman numeral, just two one's added together.
     * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     */
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); //should be 1994
    }

    public static int romanToInt(String s) {
        int prev = 0;
        int curr = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i))
            {
                case ('I'): curr = 1; break;
                case ('V'): curr = 5; break;
                case ('X'): curr = 10; break;
                case ('L'): curr = 50; break;
                case ('C'): curr = 100; break;
                case ('D'): curr = 500; break;
                case ('M'): curr = 1000; break;
            }

            if (curr > prev) result += curr - (prev * 2);
            else result += curr;
            prev = curr;
        }
        return result;
    }
}
