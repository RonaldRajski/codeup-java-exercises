package practice1;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println(firstName + " " + lastName);
        boolean isAdmin = false;
        if (isAdmin){
            System.out.println("Current User is ADMIN");
        }
        else{
            System.out.println("Current User is not ADMIN");
        }
    }
}
