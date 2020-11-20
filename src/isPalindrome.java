public class isPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder(string);
        String string2 = stringBuilder.reverse().toString();
        if(string.equals(string2)) {
            return true;
        }else {
            return false;
        }
    }
}
