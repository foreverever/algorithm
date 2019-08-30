package algorithm.codesignal.arcade.intro.problem03;

public class Solution {
    boolean checkPalindrome(String inputString) {
        int s = 0, e = inputString.length() - 1;
        while (s < e) {
            if (inputString.charAt(s) != inputString.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }

    boolean checkPalindrome2(String inputString) {
        return inputString.equals(new StringBuffer(inputString).reverse().toString());
    }
}
