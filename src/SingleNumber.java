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
        int[] x = {2, 2, 1};
        int[] y = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(x));
        System.out.println(singleNumber(y));
    }
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

}
