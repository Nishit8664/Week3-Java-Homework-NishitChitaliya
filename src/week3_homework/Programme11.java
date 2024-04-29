package week3_homework;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 */
public class Programme11 {
    public static void main(String args[]) {
        System.out.println("divided by 3: \tdivided by 5: ");
        printNumberDividedBy3And5();                    //calling method
    }

    public static void printNumberDividedBy3And5() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {                       //if else to find numbers divide by  3 and 5
                    System.out.print(i + "\t");
                    System.out.println(i);
                } else {
                    System.out.println(i);
                }
            } else {
                if (i % 5 == 0)
                    System.out.println("\t" + i);
            }
        }
    }

}