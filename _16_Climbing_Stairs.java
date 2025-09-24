public class _16_Climbing_Stairs {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.climbStairs(2));        
        System.out.println(sol.climbStairs(3));  
        System.out.println(sol.climbStairs(4));        
        System.out.println(sol.climbStairs(5));     
        System.out.println(sol.climbStairs(6));     
        System.out.println(sol.climbStairs(7));     
        System.out.println(sol.climbStairs(8));     
        System.out.println(sol.climbStairs(9));     

    }
}
// My solution
// class Solution {
//     public int climbStairs(int n) {

//         int a = 2;
//         int b = 3;
//         int ans=n;

//         n-=3;

//         while (n>0) {
//             ans = b+a;
//             a = b;
//             b = ans;
//             n--;
//         }
//         return ans;
//     }
// }

//Other solution
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}