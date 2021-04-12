package Practice4.Chapter6methods;

import java.util.Scanner;

public class Hex2Dec {
    //        main method
    public static void main(String[] args) {
//        Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Hex number");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }
    public static int hexToDecimal(String hex){
        int decimalValue=0;
        for(int i = 0; i <hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if('A' <= ch && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
