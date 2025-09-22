function plusOne(digits: number[]): number[] {
    let n = digits.length;

    for (let i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }

    const result = new Array(n + 1).fill(0);
    result[0] = 1;
    return result;
}

console.log(plusOne([1, 2, 3]));       
console.log(plusOne([4, 3, 2, 1]));    
console.log(plusOne([9]));             
console.log(plusOne([9, 9, 9, 9, 9]));
