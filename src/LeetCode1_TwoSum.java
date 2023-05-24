import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1_TwoSum {
    //LeetCode1
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.
    public static void main(String[] args) {
        LeetCode1_TwoSum soultion = new LeetCode1_TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(soultion.twoSumup(nums,target)));

    }

    public int[] twoSumup(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int complement = target - nums[i];
                return new int[]{map.get(complement), i};

            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}


