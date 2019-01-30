import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         declare HashMap object
         HashMap <type of key, type of value> = new HashMap<type of key, type of value>();
         HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

         Adding an element into HashMap
         map.put(4, 7);

         Finding an element from HashMap by index
         int value = map.get(4);

         Checking whether the key is in HashMap or not.
         boolean contain = map.containsKey(4);
         */

        HashMap<Integer, Integer> map = new HashMap<>();

        //iterate through the array elements
        for (int i = 0; i < nums.length; i++) {
            //if the complement exists in the hashmap
            //I wil return the indexes i and of the complement
            if (map.containsKey(nums[i])) return new int[]{map.get(nums[i]), i};

            map.put(target - nums[i], i);
        }
        return null;
    }


}
