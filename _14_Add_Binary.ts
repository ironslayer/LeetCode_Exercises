// function addBinary(a: string, b: string): string {
//     if (b.length > a.length) {
//         return addBinary(b, a);
//     }

//     const result: string[] = new Array(a.length + 1).fill("0");
//     let sum = 0;
//     let i = a.length - 1;
//     let j = b.length - 1;
//     let carry = 0;

//     while (i >= 0) {
//         sum = (parseInt(a[i]) || 0) + carry;

//         if (j >= 0) {
//             sum += parseInt(b[j]);
//             j--;
//         }

//         carry = Math.floor(sum / 2);
//         result[i + 1] = String(sum % 2);

//         i--;
//     }

//     if (carry === 1) {
//         result[0] = "1";
//         return result.join("");
//     }

//     return result.slice(1).join(""); 
// }

// Other solution
function addBinary(a: string, b: string): string {
    return (BigInt("0b" + a) + BigInt("0b" + b)).toString(2);
}

console.log(addBinary("11", "1"));        
console.log(addBinary("1010", "1011"));   
console.log(addBinary("0", "0"));         
console.log(addBinary("111", "1"));      
