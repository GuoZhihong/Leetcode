public class ToLowerCase709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }
    public static String toLowerCase(String str) {
        String left = null,right = null;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) < 'a' && str.charAt(i) >= 'A'){
                right = str.substring(i+1);
                if(i == 0){
                    str = (char)(str.charAt(i)+32) + right;
                    continue;
                }
                left = str.substring(0,i);
                str = left + (char)(str.charAt(i)+32) + right;
            }
        }
        return str;
    }
}
