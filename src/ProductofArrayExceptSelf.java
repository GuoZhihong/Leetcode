import java.util.Arrays;
import java.util.HashMap;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int [] input = {1,2,3,4};
        System.out.println(productExceptSelf(input));
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int x = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    x *= nums[j];
                }
            }
            ans[i] = x;
            x = 1;
        }
        return ans;
    }
}
