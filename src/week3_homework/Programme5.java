package week3_homework;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * |         Salary Slip          |
 * |______________________________|
 * | Employee Id       :  2564    |
 * | Employee Name     :  Jay     |
 * |______________________________|
 * | Basic Salary      : 25000.0  |
 * | HRA 10%           : 2500.0   |
 * | TA 9%             : 2250.0   |
 * | DA 8%             : 2000.0   |
 * | PF - 20&          : 5000.0   |
 * |______________________________|
 * | Gross Salary      : 26750.0  |
 * |==============================|
 */
public class Programme5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name : ");
        String empName = scanner.nextLine();
        System.out.println("Enter employee id : ");
        int empId = scanner.nextInt();
        System.out.println("Enter basic salary : ");
        float basicSalary = scanner.nextFloat();
        salarySlip(basicSalary, empName, empId);          //Calling salarySlip method
        scanner.close();
    }

    public static void salarySlip(float basicSalary, String empName, int empId) {
        float hra = (basicSalary * 10) / 100;               //Calculating HRA
        float ta = (basicSalary * 9) / 100;                 //Calculating TA
        float da = (basicSalary * 8) / 100;                 //Calculating DA
        float pf = (basicSalary * 20) / 100;                //Calculating PF
        float grossSalary = basicSalary + hra + ta + da - pf;   //Calculating gross salary
        System.out.println("________________________________");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id       :  " + empId + "      |");
        System.out.println("| Employee Name     :  " + empName + "  |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary      : " + basicSalary + "  |");
        System.out.println("| HRA 10%           : " + hra + "   |");
        System.out.println("| TA 9%             : " + ta + "   |");
        System.out.println("| DA 8%             : " + da + "   |");
        System.out.println("| PF - 20%          : " + pf + "   |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary      : " + grossSalary + "  |");
        System.out.println("|==============================|");
    }

}
