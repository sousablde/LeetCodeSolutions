public class Solution {
    public int[] sortArrayByParity(int[] A) {

        int[] res = new int[A.length];
        int start = 0, end = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                res[start] = A[i];
                start++;
            } else {
                res[end--] = A[i];
            }
        }
        return res;
    }
}


