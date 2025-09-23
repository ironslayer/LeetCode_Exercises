// function mySqrt(x: number): number {
//     const sqrt = Math.sqrt(x);
//     return Math.floor(sqrt);
// }


//Other solution
function mySqrt(x: number): number {
    return Math.abs(Math.floor(Math.sqrt(x)));
};

console.log(mySqrt(8));  
console.log(mySqrt(4));  
console.log(mySqrt(16));  
console.log(mySqrt(29));  
