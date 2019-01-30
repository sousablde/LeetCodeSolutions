import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15};
        //int[] nums = {3,3};
        int[] nums = {-3, 4, 3, 90};


        //int target = 9;
        //int target = 6;
        int target = 0;


        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
