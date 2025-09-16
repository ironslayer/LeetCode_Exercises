import java.util.Arrays; // Para imprimir arrays fácilmente

public class _8_Remove_Element {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {3,2,2,3};
        int k1 = sol.removeElement(nums1, 3);
        System.out.println("k1 = " + k1 + ", nums1 = " + Arrays.toString(Arrays.copyOf(nums1, k1)));
        // Esperado: [0, 1]
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int k2 = sol.removeElement(nums2, 2);
        System.out.println("k2 = " + k2 + ", nums2 = " + Arrays.toString(Arrays.copyOf(nums1, k2)));

        // Esperado: [1, 2]
        int[] nums3 = {3, 3};
        int k3 = sol.removeElement(nums3, 2);
        System.out.println("k3 = " + k3 + ", nums3 = " + Arrays.toString(Arrays.copyOf(nums1, k3)));


    }
}
// My solution
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int count = 0;
//         int tam = nums.length;
//         for (int num : nums) {
//         if (num == val) count++;
//         }
//         if (count == 0) return tam;

//         for (int i = 0; i < tam; i++) {
//             int c = i+1;
//             while (nums[i] == val) {
//                 if (c >= tam){
//                     break;
//                 }
//                 int aux = nums[i];
//                 nums[i] = nums[c]; 
//                 nums[c] = aux;
//                 c++;
//             }
//         }
        
//         return tam-count;
//     }
// }


// Other solution
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j; 
    }
}