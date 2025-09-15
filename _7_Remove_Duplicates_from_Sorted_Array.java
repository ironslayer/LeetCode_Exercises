import java.util.Arrays;

public class _7_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int k1 = sol.removeDuplicates(nums1);
        System.out.println("k1 = " + k1 + ", nums1 = " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        int[] nums2 = {1,1,2};
        int k2 = sol.removeDuplicates(nums2);
        System.out.println("k2 = " + k2 + ", nums2 = " + Arrays.toString(Arrays.copyOf(nums2, k2)));

        int[] nums3 = {3,3};
        int k3 = sol.removeDuplicates(nums3);
        System.out.println("k3 = " + k3 + ", nums3 = " + Arrays.toString(Arrays.copyOf(nums3, k3)));
    }
}

// My solution
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
