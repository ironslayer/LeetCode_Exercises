import java.lang.StringBuilder;

public class _4_Longest_Common_Prefix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String [] strs = {"flower","flow","flight"};
        String result = sol.longestCommonPrefix(strs);
        System.out.println("Result: " + result);
        String [] strs2 = {"dog","racecar","car"};
        result = sol.longestCommonPrefix(strs2);
        System.out.println("Result: " + result);

    }
}

//My solution
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String shortCad = strs[0];

        for (String s : strs) {
            if (s.length() < shortCad.length()) {
                shortCad = s;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < shortCad.length(); i++) {
            char c = shortCad.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                char d = strs[j].charAt(i);
                if (c != d) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }
        return ans.toString();
    }
}