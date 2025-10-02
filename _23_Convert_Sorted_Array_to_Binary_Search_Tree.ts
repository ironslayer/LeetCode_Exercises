
class TreeNode5 {
    val: number;
    left: TreeNode5 | null;
    right: TreeNode5 | null;

    constructor(val?: number, left?: TreeNode5 | null, right?: TreeNode5 | null) {
        this.val = val === undefined ? 0 : val;
        this.left = left === undefined ? null : left;
        this.right = right === undefined ? null : right;
    }
}

function sortedArrayToBST(nums: number[]): TreeNode5 | null {
    if (nums.length === 0) return null;

    function buildBST(left: number, right: number): TreeNode5 | null {
        if (left > right) return null;

        const mid = Math.floor((left + right) / 2);
        const root = new TreeNode5(nums[mid]);

        root.left = buildBST(left, mid - 1);
        root.right = buildBST(mid + 1, right);

        return root;
    }

    return buildBST(0, nums.length - 1);
}


function inorderTraversal(root: TreeNode5 | null, arr: number[]): void {
    if (!root) return;
    inorderTraversal(root.left, arr);
    arr.push(root.val);
    inorderTraversal(root.right, arr);
}


function main() {
    const nums1 = [-10, -3, 0, 5, 9];
    const root1 = sortedArrayToBST(nums1);
    const result1: number[] = [];
    inorderTraversal(root1, result1);
    console.log("Ejemplo 1 (inorder):", result1.join(" "));

    const nums2 = [1, 3];
    const root2 = sortedArrayToBST(nums2);
    const result2: number[] = [];
    inorderTraversal(root2, result2);
    console.log("Ejemplo 2 (inorder):", result2.join(" "));
}

main();
