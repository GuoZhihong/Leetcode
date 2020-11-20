import java.util.Arrays;
import java.util.HashMap;

/*
* 136. Single Number
Easy

2227

85

Favorite

Share
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
* */
public class SingleNumber {
    public static void main(String[] args) {
        int[] x = {1,3,1,-1,3};
        int[] y = {4, 1, 2, 1, 2};
        int[] z = {1,1,2,3,3};
        System.out.println(singleNumber(x));
        System.out.println(singleNumber(y));
        System.out.println(singleNumber(z));
    }

    /*
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> x = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!x.containsKey(nums[i])){
                x.put(nums[i],1);
            }else {
                x.put(nums[i],x.get(nums[i])+1);
            }
        }
        for (int i: x.keySet()) {
            if(x.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
*/
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0],index = 0;//first single
        while (index < nums.length - 1){
            if(nums[index] == nums[index + 1]){
                index += 2;
            }else {//mid single
                result = nums[index];
                index++;
            }
            if(index == nums.length - 1){//last single
                return nums[nums.length - 1];
            }
        }

        return result;
    }

}
