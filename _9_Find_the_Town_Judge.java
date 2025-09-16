
public class _9_Find_the_Town_Judge {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] trust1 = {{1,2}};
        System.out.println("Caso 1: " + sol.findJudge(2, trust1)); 

        int[][] trust2 = {{1,3},{2,3}};
        System.out.println("Caso 2: " + sol.findJudge(3, trust2)); 

        int[][] trust3 = {{1,3},{2,3},{3,1}};
        System.out.println("Caso 3: " + sol.findJudge(3, trust3)); 

        int[][] trust4 = {};
        System.out.println("Caso 4: " + sol.findJudge(1, trust4)); 
    }
}
// My solution
// class Solution {
//     public int findJudge(int n, int[][] trust) {
//         int[] score = new int[n + 1]; 

//         for (int[] relation : trust) {
//             int a = relation[0];
//             int b = relation[1];
//             score[a]--; 
//             score[b]++; 
//         }

//         for (int i = 1; i <= n; i++) {
//             if (score[i] == n - 1) {
//                 return i;
//             }
//         }

//         return -1; 
//     }
// }

// Other solution
class Solution {
    public int findJudge(int n, int[][] trust) 
    {
        int arr[] = new int[n + 1];
        for(int i = 0; i < trust.length; i++)
        {
            arr[trust[i][1]]++;
        }
        int judge = -1;
        for(int i = 1; i <= n; i++)
        {
            if(arr[i] == n -1)
            {
                judge = i;
                break;
            }
        }
        for(int i = 0; i < trust.length; i++)
        {
            if(judge == trust[i][0])
            {
                judge = -1;
                break;
            }
        }
        return judge;
    }
}