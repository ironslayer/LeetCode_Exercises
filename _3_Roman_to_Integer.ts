class Solution {
    private valueOf(ch: string): number {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public romanToInt(s: string): number {
        let result = 0;
        let prev = 0;

        for (let i = s.length - 1; i >= 0; i--) {
            const curr = this.valueOf(s[i]);
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}


const sol = new Solution();
const result = sol.romanToInt("MCMXCIV");  
console.log("Result:", result);
