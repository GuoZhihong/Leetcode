/*
*
* Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example 1:

Input: 2
Output: [0,1,1]
Example 2:

Input: 5
Output: [0,1,1,2,1,2]
Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
*/
public class CountingBits338 {//done in 30 mins
    public static void main(String[] args) {
        System.out.println(countBits(2));
    }
    public static int[] countBits(int num) {
        int [] result = new int [num + 1];
        for (int i = 0; i < num + 1; i++) {
            if(num == 0){
                result[0] = 0;
            }else {
                result[i] = countNum(i);
            }
        }

        return result;
    }

    private static int countNum(int num){
        String binary = Integer.toBinaryString(num);
        int counter = 0;
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }
}
