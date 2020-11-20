import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReverseInteger7 {
    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        String y = Integer.toString(x);
        if(y.length() == 1){
            return x;
        }
        if(y.charAt(0) == '-'){
            if(y.charAt(1) == '0'){
                y = y.substring(2);
                y = "-" + new StringBuilder(y).reverse().toString();
            }else {
                y = y.substring(1);
                y = "-"+ new StringBuilder(y).reverse().toString();
            }
        }else {
            if(y.charAt(0) == '0'){
                y = y.substring(1);
                y = new StringBuilder(y).reverse().toString();
            }else {
                y = new StringBuilder(y).reverse().toString();
            }
        }
        int result = 0;
        try {//这有个很大的坑！ int的范围太大的话 不能转型
            result = Integer.parseInt(y);
        }catch (Exception e){
            return 0;
        }
        return result;
    }
}
