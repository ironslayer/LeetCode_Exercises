function findJudge(n: number, trust: number[][]): number {
    const score: number[] = new Array(n + 1).fill(0);

    for (const [a, b] of trust) {
        score[a]--;
        score[b]++; 
    }

    for (let i = 1; i <= n; i++) {
        if (score[i] === n - 1) {
            return i; 
        }
    }

    return -1; 
}

console.log(findJudge(2, [[1, 2]]));
console.log(findJudge(3, [[1, 3], [2, 3]])); 
console.log(findJudge(3, [[1, 3], [2, 3], [3, 1]]));
console.log(findJudge(1, [])); 
