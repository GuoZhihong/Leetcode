import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] i = {1,2};
        System.out.println(maxSubArray(i));
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length < 1) {
            return 0;
        }
        int sum,max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
