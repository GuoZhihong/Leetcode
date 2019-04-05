/*
* Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
* */
public class ReverseString {
    public static void main(String[] args) {
        char [] x = {'h','e','l','l','o'};
        char [] y = {'H','a','n','n','a','h'};
        reverseString(x);
        reverseString(y);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+" ");
        }
        System.out.println();
    }
    public static void reverseString(char[] s) {
        char y;
        for (int i = 0; i < s.length / 2; i++) {
            y = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = y;
        }
    }
}
