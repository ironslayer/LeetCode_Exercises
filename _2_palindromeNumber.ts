function reverseNumber(num: number): number {
    let reversed = 0;
    while (num !== 0) {
        const digit = num % 10;
        reversed = reversed * 10 + digit;
        num = Math.floor(num / 10);
    }
    return reversed;
}

function isPalindrome(x: number): boolean {
    if (x < 0) {
        return false;
    }
    
    const reversed = reverseNumber(x);
    return reversed === x;
}

// Pruebas (esto no va en LeetCode, solo para probar localmente)
console.log("Result:", isPalindrome(1001)); // true
console.log("Result:", isPalindrome(12321)); // true
console.log("Result:", isPalindrome(12345)); // false
