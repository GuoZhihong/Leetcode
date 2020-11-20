import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int [] x = {0,1};
        System.out.println(findMaxLength(x));
    }

    public static int findMaxLength(int[] nums) {

        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0,ones = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j] == 0){
                    zeros++;
                }else {
                    ones++;
                }
                if(zeros == ones){
                    if(maxLength < zeros*2){
                        maxLength = zeros*2;
                    }
                }
            }
        }
        return maxLength;
    }
}
