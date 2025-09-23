public class _14_Add_Binary {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.addBinary("11", "1"));        
        System.out.println(sol.addBinary("1010", "1011"));  
        System.out.println(sol.addBinary("0", "0"));        
        System.out.println(sol.addBinary("111", "1"));     
    }
}

//My solution
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; 

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; 
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2); 
            carry = sum / 2;        
        }

        return result.reverse().toString(); 
    }
}
