public class _22_Maximum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root1 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );
        System.out.println("Ejemplo 1: " + sol.maxDepth(root1)); 

        TreeNode root2 = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(3)),
            new TreeNode(2, null, new TreeNode(3))
        );
        System.out.println("Ejemplo 2: " + sol.maxDepth(root2));
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
    public int maxDepth(TreeNode root) {

        if ( root == null )  return 0;

        int heightLeft = maxDepth( root.left );
        int heightRight = maxDepth( root.right );

        
        return 1 + Math.max(heightLeft, heightRight);
    }
}