package week3_homework;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        System.out.println("Enter any alphabet from A to F : ");
        char alphabet = scanner.next().charAt(0);
        city(alphabet);                                     //Calling method
        scanner.close();
    }

    public static void city(char alphabet) {
        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("Argentina");                    //Nested iF else to select city name
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("Bengluru");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("Chennai");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("Dubai");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("Essen");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("Florida");
        } else {
            throw new IllegalArgumentException("Alphabet is not in range");
        }
    }
}
