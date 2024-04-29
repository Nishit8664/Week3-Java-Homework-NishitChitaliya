package week3_homework;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        isLeapYear(year);
        scanner.close();
    }

    public static void isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);                                       // divisible by 4
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);    // divisible by 4, not by 100, or divisible by 400
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

