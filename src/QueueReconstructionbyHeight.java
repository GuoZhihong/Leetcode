import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.


Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
* */
public class QueueReconstructionbyHeight {
    public static void main(String[] args) {
        int [][] x = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};

        reconstructQueue(x);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+ ",");
            }
            System.out.println();
        }
    }
    public static int[][] reconstructQueue(int[][] people) {
        return null;
    }
}
