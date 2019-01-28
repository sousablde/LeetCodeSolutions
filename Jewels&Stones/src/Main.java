/*
https://leetcode.com/problems/jewels-and-stones/
 */
public class Main {

    public static void main(String[] args) {

        String J = "aA";
        String S = "aAAbbbb";

        System.out.println("Jewels: " + J);
        System.out.println("Stones: " + S);

        Solution solution = new Solution();

        System.out.println(solution.numJewelsInStones(J, S));
    }
}
