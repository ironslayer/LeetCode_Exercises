public class _10_Find_Index_of_First_Occurrence {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Resultado 1: " + sol.strStr(haystack1, needle1)); 

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Resultado 2: " + sol.strStr(haystack2, needle2)); 
    }
}

// My solution
class Solution {
    public int strStr(String haystack, String needle) {
        // Solución rápida con método de Java
        return haystack.indexOf(needle);

        // --- Opción manual sin usar indexOf ---
        /*
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
        */
    }
}
