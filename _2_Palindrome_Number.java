

public class _2_Palindrome_Number {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(101010);
        System.out.println("Result: " + result);
    }
}
// My solution
// class Solution {
//     public boolean isPalindrome(int x) {

//         if ( x < 0) {
//             return false;
//         }
        
//         int reversed = reverseNumber(x);

//         return reversed == x;
//     }

//     public int reverseNumber(int num) {
//         int reversed = 0;
//         while (num != 0) {
//             int digit = num % 10;        
//             reversed = reversed * 10 + digit;  
//             num = num / 10;             
//         }
//         return reversed;
//     }
// }


// Other solution
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int num = x;

        while (num!= 0) {
            rev= rev*10 + num%10;
            num=num/10;
        }

        return rev == x;
    }
}