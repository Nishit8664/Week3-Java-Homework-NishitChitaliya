package week3_homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even.
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        evenOdd(num);                           //Calling evenOdd method
        scanner.close();
    }

    public static void evenOdd(int num) {
        if (num % 2 == 0) {                             //dividing number by two and checking reminder
            System.out.println(num + " is even");

        } else {
            System.out.println(num + " is odd");
        }
    }
}
