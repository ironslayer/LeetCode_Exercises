
public class _12_Length_of_Last_Word {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.lengthOfLastWord("Hello World"));
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy"));

    }
}

// My solution
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }
}