import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        int counts = 0;
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(arr[i] + 1)){
                counts++;
            }
        }
        return counts;
    }
}
