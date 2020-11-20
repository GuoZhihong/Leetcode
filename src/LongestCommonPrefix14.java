import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length < 1){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               if(o1.length() < o2.length()){
                   return -1;
               }else if(o1.length() == o2.length()){
                   return 0;
               }else {
                   return 1;
               }
            }
        });
        char [] chars = strs[0].toCharArray();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if(strs[i].charAt(j) != chars[j]){
                    chars[j] = '0';
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != '0'){
                stringBuilder.append(chars[i]);
            }else {
                if(i == 0 ){
                    return "";
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String [] x = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(x));
    }
}
