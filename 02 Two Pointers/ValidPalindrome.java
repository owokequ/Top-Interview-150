/**
 * LeetCode #125 — Valid Palindrome
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        String newS = s.toLowerCase();
        while (l < r) {
            if (!Character.isLetterOrDigit(newS.charAt(l))) { // метод, который проверяет символ является цифрой или буквой
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(newS.charAt(r))) {
                r--;
                continue;
            }
            if (newS.charAt(l) == newS.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
