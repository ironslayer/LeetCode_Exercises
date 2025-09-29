public class _21_Symmetric_Tree {
    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root1 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );
        System.out.println("Ejemplo 1: " + sol.isSymmetric(root1)); 

        TreeNode root2 = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(3)),
            new TreeNode(2, null, new TreeNode(3))
        );
        System.out.println("Ejemplo 2: " + sol.isSymmetric(root2));
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

//My solution
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {

        if (left == null && right == null) return true;
        
        if (left == null || right == null) return false;

        if (left.val != right.val) return false;

        return isMirror( left.left, right.right ) && isMirror(left.right, right.left);
    }

}