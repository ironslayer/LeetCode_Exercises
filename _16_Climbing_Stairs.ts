// function climbStairs(n: number): number {
//     if (n === 0 || n === 1) {
//         return 1;
//     }
//     return climbStairs(n - 1) + climbStairs(n - 2);
// }


//Other solution

function climbStairs(n: number): number {
    if (n === 1) return 1;
    if (n === 2) return 2;

    let a = 1; 
    let b = 2;

    for (let i = 3; i <= n; i++) {
        const temp = a + b; 
        a = b;
        b = temp;
    }

    return b;
}

console.log(climbStairs(2));  
console.log(climbStairs(3));  
console.log(climbStairs(4));  
console.log(climbStairs(5));  
console.log(climbStairs(6));  
console.log(climbStairs(7));  
console.log(climbStairs(8));  
console.log(climbStairs(9));  
