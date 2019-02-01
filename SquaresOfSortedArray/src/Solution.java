import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        int oddEven = nums.length % 2 == 0? 1 : 0;
        int mid = (nums.length+oddEven)/2;

        Arrays.sort(nums);
        if (target < nums[mid] ){
            for (int i = 0, j = mid; (i < mid ) || (j > 0) ; i++, j--){
                if(nums[i] + nums[j] == target && i!=j){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }else{
            for (int i = mid, j = nums.length; (i < nums.length ) || (j > mid) ; i--, j++){
                if(nums[i] + nums[j] == target && i!=j){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            //I then iterate through the array to try to find if the complement is present in the array
//            for (int j = i + 1; j < nums.length; j++) {
//                if(nums[i]+nums[j] == target){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
        return result;


    }

}
