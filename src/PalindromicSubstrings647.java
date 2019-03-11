/*
*Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".


Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".


Note:

The input string length won't exceed 1000.
*
* */


public class PalindromicSubstrings647 {
    public static void main(String[] args) {//done in 35mins
        System.out.println(countSubstrings("abc"));
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String s1 = s.substring(i,j + 1);
                String s2 = new StringBuilder(s1).reverse().toString();
                if(s1.equals(s2)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
