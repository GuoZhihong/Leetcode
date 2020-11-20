import java.util.ArrayList;

public class MinimumPathSum {
    public static void main(String[] args) {
        int [] [] ints = {{1,2,5},{3,2,1}};
//        int [] [] ints = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(ints));
    }
    public static int minPathSum(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i == 0){
                    if(j > 0){
                        grid[i][j] = grid[i][j] + grid[i][j - 1];
                    }
                }else if(j == 0){
                    if(i > 0){
                        grid[i][j] = grid[i - 1][j] + grid[i][j];
                    }
                }else {
                    grid[i][j] = Math.min(grid[i - 1][j] + grid[i][j],grid[i][j - 1] + grid[i][j]);
                }
            }
        }
        return grid[grid.length - 1][grid[grid.length - 1].length - 1];
    }
}
