public class removeElement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }

    public static int removeElement(int[] nums, int val) {
        int originalLength = nums.length;
        int deleteNum = 0;
        for (int i = 0; i < originalLength; i++) {
            if(nums[i] == val){
                deleteNum++;

            }
        }
        int result = originalLength - deleteNum;
        return result;
    }
}
