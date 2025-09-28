
class TreeNode2 {
    val: number;
    left: TreeNode | null;
    right: TreeNode | null;

    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val === undefined ? 0 : val);
        this.left = (left === undefined ? null : left);
        this.right = (right === undefined ? null : right);
    }
}

function isSameTree(p: TreeNode | null, q: TreeNode | null): boolean {
    if (p === null && q === null) {
        return true;
    }

    if (p === null || q === null) {
        return false;
    }

    if (p.val !== q.val) {
        return false;
    }

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}


function main() {
    const p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    const q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    console.log("Ejemplo 1:", isSameTree(p1, q1)); // true

    const p2 = new TreeNode(1, new TreeNode(2), null);
    const q2 = new TreeNode(1, null, new TreeNode(2));
    console.log("Ejemplo 2:", isSameTree(p2, q2)); // false

    const p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
    const q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
    console.log("Ejemplo 3:", isSameTree(p3, q3)); // false
}

main();
