package week3_homework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           //Scanner
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        number(num);                                        //Calling static method
        scanner.close();
    }

    public static void number(int num) {                    //Static method with parameter
        String evenOdd = (num % 2 == 0) ? "even" : "odd";   //Ternary operator to find number is even or odd
        System.out.println(num + " is " + evenOdd);
    }

}
