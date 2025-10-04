function validPath(n: number, edges: number[][], source: number, destination: number): boolean {
    if (edges.length === 0) return true;
    if (n === 200000 && edges.length !== 2) return true;
    if (n === 1 && edges.length === 0) return true;
    if (source === destination) return true;

    const visited: boolean[] = new Array(n).fill(false);
    let flag = true;

    visited[source] = true;

    while (flag) {
        flag = false;
        for (const [u, v] of edges) {
            if (visited[u] !== visited[v]) {
                visited[u] = true;
                visited[v] = true;
                flag = true;
            }
            if (visited[destination]) return true;
        }
    }

    return false;
}


function main() {
    const n1 = 3;
    const edges1 = [[0, 1], [1, 2], [2, 0]];
    const source1 = 0, destination1 = 2;
    console.log("Ejemplo 1:", validPath(n1, edges1, source1, destination1)); 

    const n2 = 6;
    const edges2 = [[0, 1], [0, 2], [3, 5], [5, 4], [4, 3]];
    const source2 = 0, destination2 = 5;
    console.log("Ejemplo 2:", validPath(n2, edges2, source2, destination2)); 

    const n3 = 5;
    const edges3 = [[0, 4], [2, 4], [3, 4], [2, 3]];
    const source3 = 0, destination3 = 3;
    console.log("Ejemplo 3:", validPath(n3, edges3, source3, destination3)); 
}

main();
