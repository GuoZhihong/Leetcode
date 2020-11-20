import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int [] can = {2,3,6,7};
        combinationSum(can,7);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < i; j++) {
                if(target % candidates[j] != 0){
                    arrayList.add(candidates[j]);
                }
            }
            result.add(arrayList);
        }
        return result;
    }
}
