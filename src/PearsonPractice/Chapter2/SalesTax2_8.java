package PearsonPractice.Chapter2;

import java.util.Scanner;

public class SalesTax2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
       double purchaseAmount = input.nextDouble();


       double tax =  purchaseAmount * 0.06;
        System.out.println("Sales tax is " + (int)(tax * 100)/100);

        double amount = 5;
        System.out.println(amount/2);
        System.out.println(5/2);


        System.out.println((int) (45.378 * 100) / 100);
        System.out.println((int) (45.378 * 100) / 100.0);
        System.out.println((int) (45.378 * 100 / 100));
        System.out.println((int) (45.378) * 100 / 100.0);

        System.out.println((int) (76.0252175 * 100) / 100);




    }
}
