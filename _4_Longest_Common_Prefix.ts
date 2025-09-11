function longestCommonPrefix(strs: string[]): string {
    if (strs.length === 0) return "";

    let pref = strs[0];
    let prefixLen = pref.length;

    for (let i = 1; i < strs.length; i++) {
        const word = strs[i];

        while (prefixLen > word.length || pref !== word.substring(0, prefixLen)) {
            prefixLen--;
            if (prefixLen === 0) return "";
            pref = pref.substring(0, prefixLen);
        }
    }

    return pref;
}

// Ejemplos de uso:
const strs1 = ["flower","flow","flight"];
console.log("Result:", longestCommonPrefix(strs1)); // "fl"

const strs2 = ["dog","racecar","car"];
console.log("Result:", longestCommonPrefix(strs2)); // ""
