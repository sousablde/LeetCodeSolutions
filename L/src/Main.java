class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int[] result = new int[A.length];


        for (int row = 0; row < queries.length; row++) {
            A[queries[row][1]] = A[queries[row][1]] + queries[row][0];
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 0) {
                    result[row] = result[row] + A[i];
                }
            }
        }


        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] Q = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};

        Solution solution = new Solution();
        solution.sumEvenAfterQueries(A, Q);


    }
}
