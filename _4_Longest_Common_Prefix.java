import java.lang.StringBuilder;
import java.util.Arrays;

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
// class Solution {
//     public String longestCommonPrefix(String[] strs) {

//         String shortCad = strs[0];

//         for (String s : strs) {
//             if (s.length() < shortCad.length()) {
//                 shortCad = s;
//             }
//         }

//         StringBuilder ans = new StringBuilder();

//         for (int i = 0; i < shortCad.length(); i++) {
//             char c = shortCad.charAt(i);
//             for (int j = 0; j < strs.length; j++) {
//                 char d = strs[j].charAt(i);
//                 if (c != d) {
//                     return ans.toString();
//                 }
//             }
//             ans.append(c);
//         }
//         return ans.toString();
//     }
// }

//Other solution

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);

//         String s1 = strs[0];
//         String s2 = strs[strs.length-1];

//         int idx = 0;
//         while(idx< s1.length() && idx< s2.length()){
//             if(s1.charAt(idx) == s2.charAt(idx)){
//                 idx++;
//             }
//             else{
//                 break;
//             }
//         }
//         return s1.substring(0, idx);
        
//     }
// }


// other solution

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        int prefixLen = pref.length();
        for(int i = 1; i < strs.length; i++) {
            String word = strs[i];
            while(prefixLen > word.length() || !pref.equals(word.substring(0, prefixLen))) {
                prefixLen--;
                if(prefixLen == 0) return "";
                pref = pref.substring(0, prefixLen);
            }
        }
        return pref;
    }
}