/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 2^31.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.*/

public class HammingDistance461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {//12 mins
        String xBinary = Integer.toBinaryString(x);
        Integer.bitCount(x);
        String yBinary = Integer.toBinaryString(y);
        int shift;
        if(yBinary.length() > xBinary.length()){
            shift = yBinary.length() - xBinary.length();
            for (int i = 0; i < shift; i++) {
                xBinary = "0"+ xBinary;
            }
        }else if(yBinary.length() < xBinary.length()){
            shift = xBinary.length() - yBinary.length();
            for (int i = 0; i < shift; i++) {
                yBinary = "0"+ yBinary;
            }
        }
        int hammingDistance = 0;
        for (int i = 0; i < yBinary.length(); i++) {
            if(xBinary.charAt(i) != yBinary.charAt(i)){
                hammingDistance++;
            }
        }
        return hammingDistance;
    }

}
