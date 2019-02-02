//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //iterate through the array elements
        for (int i = 0; i < numbers.length; i++) {

            //if the complement exists in the hashmap
            //I wil return the indexes i and of the complement
            if (map.containsKey(numbers[i])) return new int[]{(map.get(numbers[i]) + 1), i + 1};

            map.put(target - numbers[i], i);
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(arr, target)));
    }
}
