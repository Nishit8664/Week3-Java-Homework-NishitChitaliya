package week3_homework;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void main(String[] args) {
        averageValueOfArray();                                              //Calling static method
    }
    public static void averageValueOfArray(){
        int array1[] = {45,50,55,60,65};
        OptionalDouble average = Arrays.stream(array1).average();           //Average function to count average
        System.out.println(average);
    }
}
