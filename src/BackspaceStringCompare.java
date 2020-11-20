import java.util.*;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare(
                "j##xfix",
                "j###xfix"));
    }
    public static boolean backspaceCompare(String S, String T) {
//        Stack<Character> characterStack1 = new Stack<>();
//        Stack<Character> characterStack2 = new Stack<>();
//        for (int i = 0; i < S.length(); i++) {
//            if(S.charAt(i) == '#'){
//                if(!characterStack1.isEmpty()){
//                    characterStack1.pop();
//                }
//            }else {
//                characterStack1.push(S.charAt(i));
//            }
//        }
//        for (int i = 0; i < T.length(); i++) {
//            if(T.charAt(i) == '#'){
//                if(!characterStack2.isEmpty()){
//                    characterStack2.pop();
//                }
//            }else {
//                characterStack2.push(T.charAt(i));
//
//            }
//        }
//        S = characterStack1.toString();
//        T = characterStack2.toString();
//        return S.equals(T);

        int i = 0;
        while (i != S.length()){
            if(S.charAt(i) == '#'){
                if(i != 0) {
                    S = S.substring(0, i - 1) + S.substring(i + 1);
                    i = 0;
                    continue;
                }else {
                    S = S.substring(1);
                    i = 0;
                    continue;
                }
            }
            i++;
        }

        int j = 0;
        while(j != T.length()){
            if(T.charAt(j) == '#'){
                if (j != 0) {
                    T = T.substring(0, j - 1) + T.substring(j + 1);
                    j = 0;
                    continue;
                }else {
                    T = T.substring(1);
                    j = 0;
                    continue;
                }
            }
            j++;
        }
        return S.equals(T);
    }
}
