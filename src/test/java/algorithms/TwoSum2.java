package algorithms;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        for(int i = 0; i < 2; i ++) {
            System.out.println(result[i]);
        }
    }
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[]{};
//        for(int i = 0; i < numbers.length - 1; i ++) {
//            int remainingNum = target - numbers[i];
//            for(int j = i + 1; j < numbers.length; j ++) {
//                if(numbers[j] == remainingNum) {
//                    result[0] = numbers[i];
//                    result[1] = numbers[j];
//                    return result;
//                }
//            }
//        }
//        return null;
//    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i ++) {
            int remaining = target - nums[i];
            for(int j = i + 1; j < nums.length; j ++) {
                if(remaining == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
