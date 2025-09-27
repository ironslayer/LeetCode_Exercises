
class TreeNode {
    val: number;
    left: TreeNode | null;
    right: TreeNode | null;
    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val === undefined ? 0 : val);
        this.left = (left === undefined ? null : left);
        this.right = (right === undefined ? null : right);
    }
}

// Solución recursiva
function inorderTraversalRecursive(root: TreeNode | null): number[] {
    const res: number[] = [];
    function helper(node: TreeNode | null) {
        if (node === null) return;
        helper(node.left);
        res.push(node.val);
        helper(node.right);
    }
    helper(root);
    return res;
}

// Solución iterativa con stack
function inorderTraversalIterative(root: TreeNode | null): number[] {
    const res: number[] = [];
    const stack: TreeNode[] = [];
    let current: TreeNode | null = root;

    while (current !== null || stack.length > 0) {
        while (current !== null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop()!;
        res.push(current.val);
        current = current.right;
    }

    return res;
}

function main() {
    const root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    console.log("Inorder Ejemplo 1 (recursivo):", inorderTraversalRecursive(root1));
    console.log("Inorder Ejemplo 1 (iterativo):", inorderTraversalIterative(root1));

    const root2 = new TreeNode(8,
        new TreeNode(4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(6, new TreeNode(5), new TreeNode(7))
        ),
        new TreeNode(12,
            new TreeNode(10, new TreeNode(9), new TreeNode(11)),
            new TreeNode(14, new TreeNode(13), new TreeNode(15))
        )
    );
    console.log("Inorder Ejemplo 2 (recursivo):", inorderTraversalRecursive(root2));
    console.log("Inorder Ejemplo 2 (iterativo):", inorderTraversalIterative(root2));
}

main();
