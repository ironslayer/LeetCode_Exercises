function findCenter(edges: number[][]): number {
    return (edges[0][0] === edges[1][0] || edges[0][0] === edges[1][1])
        ? edges[0][0]
        : edges[0][1];
}


function main() {
    const edges1 = [[1, 2], [2, 3], [4, 2]];
    console.log("Ejemplo 1:", findCenter(edges1));

    const edges2 = [[1, 2], [5, 1], [1, 3], [1, 4]];
    console.log("Ejemplo 2:", findCenter(edges2)); 
    const edges3 = [[7, 6], [2, 7], [3, 7], [4, 7], [5, 7], [1, 7]];
    console.log("Ejemplo 3:", findCenter(edges3)); 
}

main();
