package week3_homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Programme12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value : ");
        char c = scanner.next().charAt(0);
        findType(c);                                //Calling find type method
        scanner.close();
    }

    public static void findType(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {    //Nested if else to find out type of value
            System.out.println(c + " is an alphabet.");
        } else if (c >= '0') {
            System.out.println(c + " is a digit");
        } else {
            System.out.println(c + " is a special charcter");
        }
    }
}


