package week3_homework;

import java.util.Scanner;

/**
 * 9. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        System.out.println("Enter any alphabet from A to F : ");
        char alphabet = scanner.next().charAt(0);
        city(alphabet);                                     //Calling method
        scanner.close();
    }

    public static void city(char alphabet) {
        switch (alphabet) {                     //Switch to select city name
            case 'A':
            case 'a':
                System.out.println("Argentina");
                break;
            case 'B':
            case 'b':
                System.out.println("Bengluru");
                break;
            case 'C':
            case 'c':
                System.out.println("Chennai");
                break;
            case 'D':
            case 'd':
                System.out.println("Dubai");
                break;
            case 'E':
            case 'e':
                System.out.println("Essen");
                break;
            case 'F':
            case 'f':
                System.out.println("Florida");
                break;
            default:
                throw new IllegalArgumentException("Alphabet is not in range");
        }
    }
}

