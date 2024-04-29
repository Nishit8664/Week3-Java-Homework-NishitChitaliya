package week3_homework;

import java.util.Arrays;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        sumValuesOfArray();
    }
    public static void sumValuesOfArray(){
        int array1[]={45,50,55,60,65};
        int ans = Arrays.stream(array1).sum();   //Using stream.sum() to calculate sum of values of an array
        System.out.println(ans);
    }
}
