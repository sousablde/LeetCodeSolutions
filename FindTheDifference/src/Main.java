/*
https://leetcode.com/problems/find-the-difference/
 */
public class Main {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "bdcae";

        Solution solution = new Solution();

        System.out.println(solution.sorter(t));

        System.out.println(solution.findTheDifference(s, t));
    }
}
