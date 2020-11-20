import java.util.List;

public class LeftmostColumnwithatLeastaOne {
    interface BinaryMatrix {

        public int get(int x, int y);
        public List<Integer> dimensions();
    };

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {//hint 2
        List<Integer> list = binaryMatrix.dimensions();
        int rows = list.get(0);
        int col = list.get(1);
        int c = col - 1,r = 0, result = -1;
        while (r < rows && c >= 0){
            if(binaryMatrix.get(r,c) == 1){//from right-up to left-down
                result = c;
                c--;
            }else {
                r++;
            }
        }
        return result;
    }
}
