import java.util.ArrayList;
import java.util.List;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,5,0,0};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {

        if(nums.length == 1) {
            return true;
        }else if(nums.length == 0){
            return false;
        }else if(nums[0] == 0){
            return false;
        }


        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            result = jump(nums,nums[0]);
            if(result >= nums.length - 1){
                return true;
            }
        }
        return false;
    }

    private static int jump(int[] nums,int index){
        try {
            if(index >= nums.length -1){
                return index;
            }
            return jump(nums,index + nums[index]);
        }catch (StackOverflowError e){
            return -1;
        }
    }
}
