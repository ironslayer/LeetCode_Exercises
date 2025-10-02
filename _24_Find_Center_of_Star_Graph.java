public class _24_Find_Center_of_Star_Graph {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] edges1 = { {1,2}, {2,3}, {4,2} };
        System.out.println("Ejemplo 1: " + sol.findCenter(edges1)); 

        int[][] edges2 = { {1,2}, {5,1}, {1,3}, {1,4} };
        System.out.println("Ejemplo 2: " + sol.findCenter(edges2)); 

        int[][] edges3 = { {7,6}, {2,7}, {3,7}, {4,7}, {5,7}, {1,7} };
        System.out.println("Ejemplo 3: " + sol.findCenter(edges3)); 
    }
}

// class Solution {
//     public int findCenter(int[][] edges) {
//         int n = edges.length + 1; 
//         int[] freq = new int[n + 1];

//         for (int[] edge : edges) {
//             int u = edge[0];
//             int v = edge[1];
//             freq[u]++;
//             freq[v]++;
//         }

//         for (int i = 1; i <= n; i++) {
//             if (freq[i] == n - 1) {
//                 return i; 
//             }
//         }

//         return -1; 
//     }
// }

//Other solution
class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1];
        int c = edges[1][0], d = edges[1][1];

        if (a == c || a == d) return a;
        return b;
    }
}