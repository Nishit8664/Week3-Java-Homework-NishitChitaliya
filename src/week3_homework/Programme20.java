package week3_homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value : ");
        String ans = scanner.nextLine();
        findSpecificValue(ans);                                             //Calling static method
        scanner.close();
    }

    public static void findSpecificValue(String ans) {
        String array1[] = {"JAVA", "PYTHON", "C++", ".NET", "PHP"};
        boolean answer = Arrays.stream(array1).anyMatch(t -> t.equals(ans));   //Use function to find value
        if (answer) {
            System.out.println("Value found.");
        } else {
            System.out.println("Value not found");
        }
    }
}
