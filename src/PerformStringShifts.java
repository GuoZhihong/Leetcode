public class PerformStringShifts {
    public static void main(String[] args) {
        String s = "yisxjwry";int[][] shift = {{1,8},{1,4},{1,3},{1,6},{0,6},{1,4},{0,2},{0,1}};
        System.out.println(stringShift(s,shift));
    }
    public static String stringShift(String s, int[][] shift) {
       int leftCount = 0, rightCount = 0;

        for (int i = 0; i < shift.length; i++) {
            if(shift[i][0] == 0){//left
                leftCount += shift[i][1];
            }else {//right
                rightCount += shift[i][1];
            }
        }
        if(leftCount > rightCount){
            leftCount = leftCount - rightCount;
            for (int i = 0; i < leftCount; i++) {
                s = s.substring(1)+s.substring(0,1);
            }
            return s;
        }else if(leftCount < rightCount){
            rightCount = rightCount - leftCount;
            for (int i = 0; i < rightCount; i++) {
                s = s.substring(s.length() - 1) + s.substring(0,s.length() - 1);
            }
            return s;
        }else {
            return s;
        }
    }
}
