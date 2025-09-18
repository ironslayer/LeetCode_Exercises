function strStr(haystack: string, needle: string): number {
    return haystack.indexOf(needle);
}

const haystack1 = "sadbutsad";
const needle1 = "sad";
console.log(`Resultado 1: ${strStr(haystack1, needle1)}`); 

const haystack2 = "leetcode";
const needle2 = "leeto";
console.log(`Resultado 2: ${strStr(haystack2, needle2)}`); 

const haystack3 = "hello";
const needle3 = "ll";
console.log(`Resultado 3: ${strStr(haystack3, needle3)}`); 

const haystack4 = "a";
const needle4 = "a";
console.log(`Resultado 4: ${strStr(haystack4, needle4)}`); 

const haystack5 = "abc";
const needle5 = "c";
console.log(`Resultado 5: ${strStr(haystack5, needle5)}`); 
