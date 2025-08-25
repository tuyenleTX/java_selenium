package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] bruteForceSolution(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i ++) {
            int remaining = target - nums[i];
            for (int j = i + 1; j < nums.length; j ++) {
                if (remaining == nums[j]) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,7, 11, 5};
        int target = 9;
        int[] result = bruteForceSolution(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }


}
