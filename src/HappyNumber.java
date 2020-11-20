import javax.naming.TimeLimitExceededException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(23));
    }

    private static HashSet<String> sets = new HashSet<>();
    public static boolean isHappy(int n)  {
        try {
            String number = Integer.toString(n);
            if(sets.contains(number)){
                return false;
            }else {
                sets.add(number);
            }
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += (Math.pow(Character.getNumericValue(number.charAt(i)), 2));
            }
            if (sum == 1) {
                return true;
            } else {
                return isHappy(sum);
            }
        }catch (StackOverflowError e){
            return false;
        }
    }
}
