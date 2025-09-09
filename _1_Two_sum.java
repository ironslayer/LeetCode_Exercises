import java.util.*;  // Importa Map y HashMap
import java.util.Arrays; // Para imprimir arrays fácilmente

public class _1_Two_sum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(sol.twoSum(nums1, target1)));
        // Esperado: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(sol.twoSum(nums2, target2)));
        // Esperado: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(sol.twoSum(nums3, target3)));
        // Esperado: [0, 1]
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}