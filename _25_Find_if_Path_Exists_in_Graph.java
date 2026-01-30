import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _25_Find_if_Path_Exists_in_Graph {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 3;
        int[][] edges1 = { {0,1}, {1,2}, {2,0} };
        int source1 = 0, destination1 = 2;
        System.out.println("Ejemplo 1: " + sol.validPath(n1, edges1, source1, destination1)); 

        int n2 = 6;
        int[][] edges2 = { {0,1}, {0,2}, {3,5}, {5,4}, {4,3} };
        int source2 = 0, destination2 = 5;
        System.out.println("Ejemplo 2: " + sol.validPath(n2, edges2, source2, destination2)); 

        int n3 = 5;
        int[][] edges3 = { {0,4}, {2,4}, {3,4}, {2,3} };
        int source3 = 0, destination3 = 3;
        System.out.println("Ejemplo 3: " + sol.validPath(n3, edges3, source3, destination3)); 
    }
}

// class Solution {
//     public boolean validPath(int n, int[][] edges, int source, int destination) {
//         UnionFind uf = new UnionFind(n);

//         // Unimos cada par de nodos conectados
//         for (int[] edge : edges) {
//             uf.union(edge[0], edge[1]);
//         }

//         // Si source y destination están en el mismo conjunto → hay camino
//         return uf.find(source) == uf.find(destination);
//     }
// }

// // -----------------
// // Clase Union-Find
// // -----------------
// class UnionFind {
//     private int[] parent;
//     private int[] rank;

//     public UnionFind(int n) {
//         parent = new int[n];
//         rank = new int[n];
//         for (int i = 0; i < n; i++) {
//             parent[i] = i; // cada nodo es su propio padre
//             rank[i] = 1;   // rango inicial
//         }
//     }

//     public int find(int x) {
//         if (parent[x] != x) {
//             parent[x] = find(parent[x]); // compresión de caminos
//         }
//         return parent[x];
//     }

//     public void union(int x, int y) {
//         int rootX = find(x);
//         int rootY = find(y);

//         if (rootX != rootY) {
//             // unir por rango (el más alto absorbe al más bajo)
//             if (rank[rootX] > rank[rootY]) {
//                 parent[rootY] = rootX;
//             } else if (rank[rootX] < rank[rootY]) {
//                 parent[rootX] = rootY;
//             } else {
//                 parent[rootY] = rootX;
//                 rank[rootX]++;
//             }
//         }
//     }
// }



//Other solution
// class Solution {
//     public boolean validPath(int n, int[][] edges, int source, int destination) {
//         if(edges.length == 0) return true;
//          if (n == 200000 && edges.length != 2) return true;
//         if(n==1 && edges.length==0) return true;
//         if(source == destination) return true;
//         boolean[] visited = new boolean[n];
//         boolean flag = true;
//         visited[source] = true;
//     while(flag){
//         flag = false;
//         for(int[] edge : edges){
//             if(visited[edge[0]] != visited[edge[1]]){
//                 visited[edge[0]] = true;
//                 visited[edge[1]] = true;
//                 flag = true;
//             }
//             if(visited[destination]) return true;
//         }
//     }
//     return false;
//     }
// }










// Other solution

// class Solution {





//     class DisjointSetUnion{

//         int parent[];
//         int N;

//         public DisjointSetUnion(int n){
//             this.parent = new int[n];
//             this.N = n;

//             for(int i=0; i<this.N; i++){
//                 parent[i] = i;
//             }

//         }

//         public int find(int u){
//             int x = u;

//             while(x != this.parent[x]){
//                 x = this.parent[x];
//             }

//             this.parent[u] = x;

//             return x;
//         }

//         public boolean areConnected(int u, int v){
            
//             if(u == v){
//                 return true;
//             }
            
//             return find(u) == find(v);
//         }

//         public void union(int u, int v){

//             if(u == v){
//                 return;
//             }

//             int a = find(u);
//             int b = find(v);

//             parent[a] = b;


//         }

//     }

//     public boolean validPath(int n, int[][] edges, int source, int destination) {
        
//         DisjointSetUnion set = new DisjointSetUnion(n);

//         for(int edge[] : edges){
//             set.union(edge[0], edge[1]);
//         }

//         return set.areConnected(source, destination);

//     }
// }

// Other solution
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == destination) return true;

            for (int nei : graph[node]) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.offer(nei);
                }
            }
        }

        return false;
    }
}