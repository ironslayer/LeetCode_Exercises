//Solution
// function isValid(s: string): boolean {
//     if (s.length % 2 !== 0) return false;

//     const chr: string[] = s.split('');

//     const stack: string[] = new Array(s.length);
//     let top = 0;

//     for (let i = 0; i < chr.length; i++) {
//         switch (chr[i]) {
//             case '(': case '{': case '[':
//                 stack[top++] = chr[i];  
//                 break;
//             case ')':
//                 if (top === 0 || stack[--top] !== '(') return false; 
//                 break;
//             case '}':
//                 if (top === 0 || stack[--top] !== '{') return false;
//                 break;
//             case ']':
//                 if (top === 0 || stack[--top] !== '[') return false;
//                 break;
//         }
//     }

//     return top === 0; 
// }

//other solution

function isValid(s: string): boolean {
    const bracketMap: { [key: string]: string } = {
        ')': '(',
        ']': '[',
        '}': '{',
    };

    const stack: string[] = [];
    for (const c of s) {
        if ('([{'.includes(c)) {
            stack.push(c);
        } else {
            if (bracketMap[c] !== stack.pop())
                return false;
        }
    }

    return stack.length === 0;
}

console.log(isValid("()[]{}"));  // true
console.log(isValid("(){}}{"));  // false
console.log(isValid("()[]"));    // true
console.log(isValid("([])"));    // true
console.log(isValid("([)]"));    // false
console.log(isValid("["));       // false
