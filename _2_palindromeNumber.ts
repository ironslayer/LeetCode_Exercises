// My solution
// function reverseNumber(num: number): number {
//     let reversed = 0;
//     while (num !== 0) {
//         const digit = num % 10;
//         reversed = reversed * 10 + digit;
//         num = Math.floor(num / 10);
//     }
//     return reversed;
// }

// function isPalindrome(x: number): boolean {
//     if (x < 0) {
//         return false;
//     }
    
//     const reversed = reverseNumber(x);
//     return reversed === x;
// }


//other solution
function isPalindrome(x: number): boolean {
    return String(x) == String(x).split('').reverse().join('')
};

console.log("Result:", isPalindrome(1001)); 
console.log("Result:", isPalindrome(12321)); 
console.log("Result:", isPalindrome(12345));
