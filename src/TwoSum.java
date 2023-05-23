import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum soultion = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(soultion.twoSumup(nums,target)));

    }

    public int[] twoSumup(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int complement = target - nums[i];
//                System.out.println(map.get(complement));
                return new int[]{map.get(complement), i};

            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}


