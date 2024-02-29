package com.example.array.slidingwindow;
/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters lsrc = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(lsrc.longestSubstring("abcabcbb", "abcabcbb".length()));
    }

    //Brute Force - O(n^3)
    private Boolean checkUniqueSubstring(String str,int i,int j){
        boolean visited[] = new boolean[256];
        for(int k=i; k<=j; k++){
            if(visited[str.charAt(k)]){
                return Boolean.FALSE;
            }
            visited[str.charAt(k)] = true;
        }
        return Boolean.TRUE;
    }

    public int longestSubstring(String str,int n){
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(checkUniqueSubstring(str,i,j) == true){
                    maxLength = Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }
}
