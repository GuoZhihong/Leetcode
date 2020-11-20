public class NumberofIslands {
    public static void main(String[] args) {
//        char[][] ints = {{'1', '0', '1', '1', '0', '1', '1'}};
        char [] [] ints = {{'1','1','0','0','0'},{'1','1','0','0','0'},
                {'0','0','1','0','0'},{'0','0','0','1','1'}};
//        char [] [] ints = {{'1'}};
        System.out.println(numIslands(ints));
    }

    public static int numIslands(char[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    if(isNewLand(grid,i,j)){
                        island++;
                    }
                }else {

                }
            }
        }
        return island;
    }

    private static boolean isNewLand(char [][]grid , int x, int y){
        if(!isEdge(grid,x,y)){
            if(grid[x - 1][y] == '1' || grid[x + 1][y] == '1' ||grid[x][y - 1] == '1'||grid[x][y + 1] == '1'){
                return false;
            }else {
                return true;
            }
        }else {
            if(x == 0){//upper edge
                if(y == 0){//left point
                    return true;
                }else if(y == grid[x].length - 1){//right point
                    if(singleRow(grid)){
                        if(grid[x][y - 1] == '1'){
                            return false;
                        }else {
                            return true;
                        }
                    }else {
                        if(grid[x - 1][y] == '1' || grid[x][y + 1] == '1'){
                            return false;
                        }else {
                            return true;
                        }
                    }
                }else {
                    if(singleRow(grid)){
                        if(grid[x][y - 1] == '1' || grid[x][y + 1] == '1'){
                            return false;
                        }else {
                            return true;
                        }
                    }else {
                        if(grid[x][y - 1] == '1' || grid[x][y + 1] == '1' || grid[x + 1][y] == '1'){
                            return false;
                        }else {
                            return true;
                        }
                    }
                }
            }else {//lower edge
                if(y == 0){//left point
                    if(singleCol(grid,x)){
                        if(grid[x - 1][y] == '1'){
                            return false;
                        }else {
                            return true;
                        }
                    }else {
                        if(grid[x - 1][y] == '1' || grid[x][y + 1] == '1'){
                            return false;
                        }else {
                            return true;
                        }
                    }
                }else if(y == grid[x].length - 1){//right point
                    if(grid[x - 1][y] == '1' || grid[x][y - 1] == '1'){
                        return false;
                    }else {
                        return true;
                    }
                }else {
                    if(grid[x - 1][y] == '1'||grid[x][y - 1] == '1'||grid[x][y + 1] == '1'){
                        return false;
                    }else {
                        return true;
                    }
                }
            }
        }
    }

    private static boolean isEdge(char [][] grid,int x,int y){
        if(x == 0 || y == 0 || x == grid.length - 1 || y == grid[x].length - 1){
            return true;
        }else {
            return false;
        }
    }

    private static boolean singleRow(char [][] grid){
        if(grid.length <= 1){
            return true;
        }
        return false;
    }
    private static boolean singleCol(char [][] grid,int x){
        if(grid[x].length <= 1){
            return true;
        }
        return false;
    }
}
