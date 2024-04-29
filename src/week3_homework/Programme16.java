package week3_homework;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        findNumber(num);                //Calling findNumber method
        scanner.close();

    }

    public static void findNumber(int num) {
        if (num == 0) {                               //Nested if else to find number is negative,positive, or zero
            System.out.println("Number is ZERO.");
        } else if (num > 0) {
            System.out.println("Number is POSITIVE.");
        } else {
            System.out.println("Number is NEGATIVE.");

        }
    }
}
