import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if(nums[i] + nums[j + 1] == target){
                    return new int[]{i, j + 1};
                }
            }
        }
        return new int []{};
//        int [] finalResult = new int[]{};
    }
}
