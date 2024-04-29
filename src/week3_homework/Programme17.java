package week3_homework;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int my_array1[] = {189, 035, 189, 1456, 201, 458};                       //Numeric array
        String my_array2[] = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};  //String array
        Arrays.sort(my_array1);                                          // Sort the numeric array in ascending order.
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array2);                                          // Sort the string array in alphabetical order.
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}

