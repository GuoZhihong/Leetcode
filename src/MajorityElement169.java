import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i]) + 1);
            }else {
                hashMap.put(nums[i],1);
            }
        }
        int result = 0,count = 0;
        for (int x: hashMap.keySet()) {
            if(count <= hashMap.get(x)){
                count = hashMap.get(x);
                result = x;
            }
        }
        return result;
    }
}
