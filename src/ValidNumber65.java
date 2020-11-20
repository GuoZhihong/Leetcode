public class ValidNumber65 {
    public static void main(String[] args) {
        System.out.println(isNumber(" -.7e+0435"));
    }
    public static boolean isNumber(String s) {
        s = s.trim();
        if(s.equals(null) || s.length() == 0){
            return false;
        }
        char [] chars = s.toCharArray();
        boolean sign = false,expontiel = false,dot = false,num = false;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '+' || chars[i] == '-'){
                if(i == 0){
                    continue;
                }
                if(i == chars.length -1 ){
                    return false;
                }
                if(!expontiel){
                    if(i != 0) {
                        return false;
                    }
                }
                if(sign && expontiel){
                    return false;
                }else {
                    sign = true;
                    continue;
                }
            }

            if(chars[i] < '0' || chars[i] > '9'){
                if(chars[i] != 'e' && chars[i] != '.'){
                    return false;
                }else {
                    if (chars[i] == 'e'){
                        if(dot && !num){
                            return false;
                        }
                        if(expontiel || !num){
                            return false;
                        }else {
                            if(i == 0){
                                return false;
                            }
                            if(i == chars.length - 1){
                                return false;
                            }
                            expontiel = true;
                            continue;
                        }

                    }
                    if(chars[i] == '.'){
                        if(!num && i == chars.length - 1){
                            return false;
                        }
                        if(dot || expontiel||s.length() == 1){
                            return false;
                        }else {
                            dot = true;
                            continue;
                        }
                    }
                }
            }
            num = true;
        }
        return true;
    }
}
