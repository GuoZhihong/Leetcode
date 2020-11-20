import java.util.Arrays;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for (int i = stones.length - 1; i > 0 ; i--) {
            stones[i - 1] = stones[i] - stones[i - 1];
            Arrays.sort(stones);
        }
        return stones[0];
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
