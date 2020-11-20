public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int [] ints = {4,5,6,7,0,1,2};
        System.out.println(search(ints,0));
    }
    public static int search(int[] nums, int target) {
        int l = 0,r = nums.length - 1;
        while (r >= l){
            if(nums[l] == target){
                return l;
            }else if(nums[r] == target){
                return r;
            }
            l++;
            r--;
        }
        return -1;
    }
}
