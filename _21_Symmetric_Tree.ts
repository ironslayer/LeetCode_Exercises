class TreeNode3 {
  val: number;
  left: TreeNode3 | null;
  right: TreeNode3 | null;

  constructor(val?: number, left?: TreeNode3 | null, right?: TreeNode3 | null) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
  }
}

// function isSymmetric(root: TreeNode3 | null): boolean {
//   if (!root) return true;

//   function isMirror(left: TreeNode3 | null, right: TreeNode3 | null): boolean {
//     if (!left && !right) return true;
//     if (!left || !right) return false;
//     if (left.val !== right.val) return false;

//     return isMirror(left.left, right.right) && isMirror(left.right, right.left);
//   }

//   return isMirror(root.left, root.right);
// }

// Other solution


function isSymmetric(root: TreeNode3 | null): boolean {
    if (!root) return true;

    function isMirror(t1: TreeNode3 | null, t2: TreeNode3 | null): boolean {
        if (!t1 && !t2) return true;
        if (!t1 || !t2) return false;

        return (
            t1.val === t2.val &&
            isMirror(t1.left, t2.right) &&
            isMirror(t1.right, t2.left)
        );
    }

    return isMirror(root.left, root.right);
}


function main() {
  const root1 = new TreeNode3(
    1,
    new TreeNode3(2, new TreeNode3(3), new TreeNode3(4)),
    new TreeNode3(2, new TreeNode3(4), new TreeNode3(3))
  );
  console.log("Ejemplo 1:", isSymmetric(root1));

  const root2 = new TreeNode3(
    1,
    new TreeNode3(2, null, new TreeNode3(3)),
    new TreeNode3(2, null, new TreeNode3(3))
  );
  console.log("Ejemplo 2:", isSymmetric(root2));

  const root3 = new TreeNode3(1); 
  console.log("Ejemplo 3:", isSymmetric(root3)); 

  const root4 = new TreeNode3(
    1,
    new TreeNode3(2, new TreeNode3(3), null),
    new TreeNode3(2, null, new TreeNode3(3))
  );
  console.log("Ejemplo 4:", isSymmetric(root4)); 
}

main();
