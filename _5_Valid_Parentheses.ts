//Solution
function isValid(s: string): boolean {
    if (s.length % 2 !== 0) return false;

    const chr: string[] = s.split('');

    const stack: string[] = new Array(s.length);
    let top = 0;

    for (let i = 0; i < chr.length; i++) {
        switch (chr[i]) {
            case '(': case '{': case '[':
                stack[top++] = chr[i];  
                break;
            case ')':
                if (top === 0 || stack[--top] !== '(') return false; 
                break;
            case '}':
                if (top === 0 || stack[--top] !== '{') return false;
                break;
            case ']':
                if (top === 0 || stack[--top] !== '[') return false;
                break;
        }
    }

    return top === 0; 
}


console.log(isValid("()[]{}"));  // true
console.log(isValid("(){}}{"));  // false
console.log(isValid("()[]"));    // true
console.log(isValid("([])"));    // true
console.log(isValid("([)]"));    // false
console.log(isValid("["));       // false
