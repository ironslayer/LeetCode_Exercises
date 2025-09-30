
class TreeNode4 {
    val: number;
    left: TreeNode4 | null;
    right: TreeNode4 | null;

    constructor(val?: number, left?: TreeNode4 | null, right?: TreeNode4 | null) {
        this.val = (val === undefined ? 0 : val);
        this.left = (left === undefined ? null : left);
        this.right = (right === undefined ? null : right);
    }
}

function maxDepth(root: TreeNode4 | null): number {
    if (root === null) return 0;

    const heightLeft = maxDepth(root.left);
    const heightRight = maxDepth(root.right);

    return 1 + Math.max(heightLeft, heightRight);
}


function main() {
    const root1 = new TreeNode4(1,
        new TreeNode4(2, new TreeNode4(3), new TreeNode4(4)),
        new TreeNode4(2, new TreeNode4(4), new TreeNode4(3))
    );
    console.log("Ejemplo 1:", maxDepth(root1)); 

    const root2 = new TreeNode4(1,
        new TreeNode4(2, null, new TreeNode4(3)),
        new TreeNode4(2, null, new TreeNode4(3))
    );
    console.log("Ejemplo 2:", maxDepth(root2));

    console.log("Ejemplo 3:", maxDepth(null)); 

    const root4 = new TreeNode4(1);
    console.log("Ejemplo 4:", maxDepth(root4)); 
}

main();
