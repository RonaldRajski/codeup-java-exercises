package util;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    //    String getString()

    public String getString(){
        System.out.println("Enter a String");
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    //    boolean yesNo()
    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userInput = this.scanner.next();
        return userInput.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = this.scanner.next();
        return userInput.toLowerCase().startsWith("y");
    }


//    int getInt(int min, int max)


//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()

}
