
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (int i : moves.toCharArray()) {
            if (i == 'U') y++;
            if (i == 'D') y--;
            if (i == 'L') x--;
            if (i == 'R') x++;
        }
        return (x == 0) && (y == 0);
    }
}

public class Main {

    public static void main(String[] args) {
        String moves = "ULDR";

        Solution solution = new Solution();
        System.out.println(solution.judgeCircle(moves));

    }
}
