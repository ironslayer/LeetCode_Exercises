public class _23_Convert_Sorted_Array_to_Binary_Search_Tree {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode root1 = sol.sortedArrayToBST(nums1);
        System.out.print("Ejemplo 1 ([-10, -3, 0, 5, 9]): ");
        printInOrder(root1); 
        System.out.println();

        int[] nums2 = {1, 3};
        TreeNode root2 = sol.sortedArrayToBST(nums2);
        System.out.print("Ejemplo 2 ([1, 3]): ");
        printInOrder(root2); 
        System.out.println();

        int[] nums3 = {0};
        TreeNode root3 = sol.sortedArrayToBST(nums3);
        System.out.print("Ejemplo 3 ([0]): ");
        printInOrder(root3); 
        System.out.println();
    }

    // Función de apoyo: imprime el árbol en orden (inorder traversal)
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) return null; // caso base

        int mid = left + (right - left) / 2; // para evitar overflow
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums, left, mid - 1);   // construir izquierda
        root.right = buildTree(nums, mid + 1, right); // construir derecha

        return root;
    }
}
