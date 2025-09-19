import java.util.Arrays;

public class _11_Search_Insert_Position {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Input: " + Arrays.toString(nums1) + ", target=" + target1);
        System.out.println("Output: " + sol.searchInsert(nums1, target1)); 

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Input: " + Arrays.toString(nums2) + ", target=" + target2);
        System.out.println("Output: " + sol.searchInsert(nums2, target2)); 

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Input: " + Arrays.toString(nums3) + ", target=" + target3);
        System.out.println("Output: " + sol.searchInsert(nums3, target3)); 

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Input: " + Arrays.toString(nums4) + ", target=" + target4);
        System.out.println("Output: " + sol.searchInsert(nums4, target4)); 
    }
}
//My solution
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2; 
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return left;
//     }
// }

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) >>> 1);

            if(target == nums[mid]){
                return mid;
            }
            if (target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
