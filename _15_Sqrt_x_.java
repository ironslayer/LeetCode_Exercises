
public class _15_Sqrt_x_ {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.mySqrt(8));        
        System.out.println(sol.mySqrt(4));  
        System.out.println(sol.mySqrt(16));        
        System.out.println(sol.mySqrt(29));     
    }
}

//My solution
class Solution {
    public int mySqrt(int x) {
        int numOdd = 1;
        int c = 0;
        while (x > 0) {
            x-=numOdd;
            numOdd+=2;
            c++;
        }
        return x<0? c-1:c;
    }
}