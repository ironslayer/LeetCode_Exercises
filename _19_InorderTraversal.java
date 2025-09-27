import java.util.*;

public class _19_InorderTraversal {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Ejemplo 1
        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println("Inorder Ejemplo 1 : " + sol.inorderTraversal(root1));

        // Ejemplo 2 (árbol más grande)
        TreeNode root2 = new TreeNode(8,
            new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6, new TreeNode(5), new TreeNode(7))
            ),
            new TreeNode(12,
                new TreeNode(10, new TreeNode(9), new TreeNode(11)),
                new TreeNode(14, new TreeNode(13), new TreeNode(15))
            )
        );
        System.out.println("Inorder Ejemplo 2: " + sol.inorderTraversal(root2));
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

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         inorderHelper(root, res);
//         return res;
//     }
//     private void inorderHelper(TreeNode node, List<Integer> res) {
//         if (node == null) return;
//         inorderHelper(node.left, res);
//         res.add(node.val);
//         inorderHelper(node.right, res);
//     }

// }

//Other solution
// class Solution {

//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         Stack<TreeNode> stack = new Stack<>();
//         TreeNode current = root;

//         while (current != null || !stack.isEmpty()) {
//             while (current != null) {
//                 stack.push(current);
//                 current = current.left;
//             }
//             current = stack.pop();
//             res.add(current.val);
//             current = current.right;
//         }
//         return res;
//     }
// }

//Other solution
class Solution {
    private List<Integer> answer;
    public List<Integer> inorderTraversal(TreeNode root) {
        this.answer=new ArrayList<>();
        inorder(root);
        return this.answer;
    }
    public void inorder(TreeNode node){
        if(node!=null){
            inorder(node.left);
            this.answer.add(node.val);
            inorder(node.right);
        }
    }
}