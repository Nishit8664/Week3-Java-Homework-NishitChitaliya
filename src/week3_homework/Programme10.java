package week3_homework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number : ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter eny symbol from '+', '-', '*' or '/' : ");
        char symbol = scanner.next().charAt(0);
        System.out.println(ans(symbol, firstNum, secondNum));           //Calling ans method
        scanner.close();
    }

    public static float ans(char symbol, int firstNum, int secondNum) {
        int ans;
        if (symbol == '+') {                                        //Nested if else to select symbol
            ans = firstNum + secondNum;
            System.out.println("Sum of two number is : " + ans);
        } else if (symbol == '-') {
            ans = firstNum - secondNum;
            System.out.println("Substraction of two number is : " + ans);
        } else if (symbol == '*') {
            ans = firstNum * secondNum;
            System.out.println("Multiplication of two number is : " + ans);
        } else if (symbol == '/') {
            ans = firstNum / secondNum;
            System.out.println("First number divided by second is : " + ans);
        } else {
            throw new IllegalArgumentException("Enter valid symbol.");
        }
        return ans;
    }
}