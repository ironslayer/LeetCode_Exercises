

public class _2_Palindrome_Number {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(0);
        System.out.println("Result: " + result);
    }
}
// My solution
class Solution {
    public boolean isPalindrome(int x) {

        if ( x < 0) {
            return false;
        }
        
        int reversed = reverseNumber(x);

        return reversed == x;
    }

    public int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;        
            reversed = reversed * 10 + digit;  
            num = num / 10;             
        }
        return reversed;
    }
}