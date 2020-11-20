public class addStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("5297", "6019530762"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int num3,num4;
        if(num1.length()< 10 && num2.length()<10){
            num3 = pharseInt(num1);
            num4 = pharseInt(num2);
            stringBuilder.append(num3+num4);
        }else if(num1.length()>= 10 && num2.length()<10){
            stringBuilder.append(num1.substring(0,num1.length() - 9));
            num3 = pharseInt(num1.substring(num1.length() - 9));
            num4 = pharseInt(num2);
            stringBuilder.append(num3+num4);
        }else if(num2.length() >= 10&& num1.length()<10){
            stringBuilder.append(num2.substring(0,num2.length() - 9));
            num3 = pharseInt(num1);
            num4 = pharseInt(num2.substring(num2.length() - 9));
            stringBuilder.append(num3+num4);
        }else{
            int num5 = pharseInt(num1.substring(0,num1.length() - 9));
            int num6 = pharseInt(num2.substring(0,num2.length() - 9));
            stringBuilder.append(num5+num6);
            num3 = pharseInt(num1.substring(num1.length() - 9));
            num4 = pharseInt(num2.substring(num2.length() - 9));
            stringBuilder.append(num3+num4);

        }
        return stringBuilder.toString();
    }
    private static int pharseInt(String num){
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = digit(num.charAt(i));
            result += Math.pow(10,num.length() - i - 1) * digit;
        }
        return result;
    }
    private static int digit(char c){
        switch (c){
            case '0':return 0;
            case '1':return 1;
            case '2':return 2;
            case '3':return 3;
            case '4':return 4;
            case '5':return 5;
            case '6':return 6;
            case '7':return 7;
            case '8':return 8;
            case '9':return 9;
        }
        return 0;
    }
    private static String pharseString(int num){
        StringBuilder result = new StringBuilder();
        return result.append(num).toString();
    }

}
