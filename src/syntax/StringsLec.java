package syntax;
import java.util.Locale;
import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        String firstName = "Ron";
        int age = 50;
//        firstName = "Ronald";
        System.out.println("What's your name?");
        firstName = sc.nextLine();

        if(firstName.equals("Ron")){
            System.out.println("firstName is Ron");
        }
        else{
            System.out.println("firstName is not Ron");
        }

        System.out.println("Your name is" + firstName);

        System.out.println("What's your email");
        String email = sc.nextLine().toLowerCase();


        if(sc.nextLine().equalsIgnoreCase("fer@codeup.ccm")){
            System.out.println("You're an admin");

//            to check if you work with the company

            if(email.toLowerCase().endsWith("codeup.com")){
                System.out.println("Welcome co-worker");
            }
            System.out.println("Your name is : " + firstName);
        }
    }
}
