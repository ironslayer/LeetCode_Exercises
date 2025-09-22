
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class _13_Plus_One {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,2,3};
        System.out.println(Arrays.toString(sol.plusOne(nums1)));
        int[] nums2 = {4,3,2,1};
        System.out.println(Arrays.toString(sol.plusOne(nums2)));
        int[] nums3 = {9};
        System.out.println(Arrays.toString(sol.plusOne(nums3)));
        int[] nums4 = {9,9,9,9,9,9};
        System.out.println(Arrays.toString(sol.plusOne(nums4)));

    }
}

//My solution
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            digits[0]++;
        }else{
            digits[digits.length-1]++;
            for (int i = digits.length-1; i > 0; i--) {
                if (digits[i] == 10) {
                    digits[i] = 0;
                    digits[i-1]++;
                }
            }
        }
        if (digits[0] == 10){
            int [] newArray = new int[digits.length+1];
            for (int i = newArray.length-1; i > 1; i--) {
                newArray[i] = digits[i-1];
            }
            newArray[0] = 1;
            newArray[1] = 0;
            return newArray;
        }
        return digits; 
    }
}