//https://leetcode.com/problems/di-string-match/

import java.util.Arrays;

class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] result = new int[N + 1];
        int start = 0, end = N, index = 0;
        char[] str = S.toCharArray();

        for (int i = 0; i < N; i++) {
            result[index++] = (str[i] == 'D' ? end-- : start++);
        }

        result[index] = start;
        return result;

    }

}

public class Main {

    public static void main(String[] args) {
        String S = "IDID";

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.diStringMatch(S)));

    }
}
