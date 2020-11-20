public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int [] ints = {0,0,0,0,0,0,0,0,0,0};
        System.out.println(subarraySum(ints,0));
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0,sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if(sum == k){
                count++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if(sum  == k){
                    count++;
                }
            }
        }
        return count;
    }
}
