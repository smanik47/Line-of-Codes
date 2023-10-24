public class Solution {
    public int[][] solve(int[][] A) {

        int N = A.length; 
        int M = A[0].length; 

        int A_T[][] = new int [M][N];

        for (int i = 0; i<N; i++){
            for (int j = 0; j<M; j++){
                A_T[j][i] = A[i][j]; 
            }
        }
    return A_T; 
    } 
}
