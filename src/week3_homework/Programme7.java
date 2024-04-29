package week3_homework;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller's name : ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter sales id : ");
        int salesId = scanner.nextInt();
        System.out.println("Enter sales amount : ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter basic salary : ");
        int basicSalary = scanner.nextInt();
        double commi = commission(salesAmount);
        prindDetails(sellerName, salesId, salesAmount, basicSalary, commi);     //Calling print details method
        scanner.close();
    }

    public static double commission(int salesAmount) {
        double commission;                              //If else to calculate commission
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
        } else {
            commission = (salesAmount * 2) / 100;
        }
        return commission;
    }

    public static void prindDetails(String sellerName, int salesId, int salesAmount, int basicSalary, double commi) {
        System.out.println("Seller Name  : " + sellerName);
        System.out.println("Sales ID     : " + salesId);
        System.out.println("Sales Amount : " + salesAmount);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Commission   : " + commi);
    }
}
