/*
* Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*
*
* */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> x = fizzBuzz(15);
        for (String y:x) {
            System.out.println(y);
        }
    }
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> x = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            if( (i+1) % 3 == 0 && (i+1) % 5 != 0){
                x.add(i,"Fizz");
            }
            if((i+1) % 5 == 0 && (i+1) % 3 != 0){
                x.add(i,"Buzz");
            }
            if((i+1) % 3 != 0 && (i+1) % 5 != 0){
                x.add(i,Integer.toString(i+1));
            }
            if((i+1) % 3 == 0 && (i+1) % 5 == 0){
                x.add(i,"FizzBuzz");
            }
        }
        return x;
    }
}
