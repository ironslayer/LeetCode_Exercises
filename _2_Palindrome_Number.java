

public class _2_Palindrome_Number {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(10);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        int amountDigits = String.valueOf(Math.abs(x)).length();
        System.out.println(amountDigits);
        return true;
    }
}