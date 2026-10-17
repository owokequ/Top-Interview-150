import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #3 — Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcacaacb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> preResult = new HashSet<>(); 
        int l = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            while (preResult.contains(currentChar)){
                preResult.remove(s.charAt(l));
                l++;
            }
            preResult.add(currentChar);
            maxLength = Math.max(maxLength, i - l + 1);
        }

        return maxLength;
    }
}
