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


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromicSubstrings647 {
    public static void main(String[] args) {//done in 35mins
        System.out.println(countSubstrings2("abc"));
        System.out.println(countSubstrings2("aaa"));
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

    public static int countSubstrings2(String s) {
        Queue<Character> queue = new LinkedList<>();
        Queue<Character> queue2 = new LinkedList<>();
        int counter = 0;
        String s2 = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
            queue2.offer(s2.charAt(i));
        }
        String x,y;
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            x = stringBuilder1.append(queue.poll()).toString();
            y = stringBuilder2.append(queue2.poll()).toString();
            if(x.equals(y)){
                counter++;
            }
        }
        return counter;
    }
}
