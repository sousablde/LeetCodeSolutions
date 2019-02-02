import java.util.Arrays;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        rowFlipper(A);
        return inverter(A);

    }

    public int[][] rowFlipper(int[][] A) {
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                if (A[row][col] == 0) {
                    A[row][col] = 1;
                } else {
                    A[row][col] = 0;
                }

                System.out.println("test 3" + Arrays.deepToString(A));
            }
        }
        return A;
    }

    public int[][] inverter(int[][] A) {

        int[][] temp = new int[A.length][A[0].length];

        for (int row = 0; row < temp.length; row++) {
            int end = (temp.length - 1);
            for (int col = 0; col < temp[0].length; col++) {
                System.out.println("test 1" + Arrays.deepToString(temp));

                temp[row][col] = A[row][end];
                System.out.println("test 2" + Arrays.deepToString(temp));
                end--;
            }
        }
        return temp;
    }


}

public class Main {

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.flipAndInvertImage(A)));

    }
}
