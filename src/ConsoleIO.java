import java.util.Scanner;


public class ConsoleIO {
    public static void main(String[] args) {

        System.out.print("This is from print.\n");
//        \n establishes a new line
        System.out.println("Hello Kalypso");
        String greeting = "Bonjour";
        String name = "Kalypso";
        System.out.printf("%s, %s!%n", greeting, name);


        double price1 =23.45;
        double price2 = 50;
        double price3 = 5.40;
//
        double total = (price1 + price2 + price3);
        System.out.printf("Your total is $%7.2f%n", total);
//        7 provides additional space in output

        System.out.printf("Your total is $%.3f%n", total);
        System.out.printf("Your total is $% f%n", -1*total);


        Scanner scanner = new Scanner(System.in);
//        new variable =  scanner
//                can be used for prompting user to type stuff
        System.out.println("Please tell us your name: ");
        name = scanner.next()

    }

}
