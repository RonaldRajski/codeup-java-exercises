import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(3,1));
        System.out.println(multiplication(2,4));
        System.out.println(division(6,3));
        System.out.println(modulus(25,5));
        System.out.println(multiAddition(7, 8));
        System.out.println(multiAdditionRecursive(5, 8));
        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());


    }


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }


    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;

    }

//    Bonus
//
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static int multiAddition(int base, int multiplier) {
        int total = 0;
        for (int i = 0; i < multiplier; i++) {
            total += base;
        }
        return total;
    }

    public static long multiAdditionRecursive(int base, int multiplier){
        if(base  == 0 || multiplier == 0){
            return 0;
        }
        return base + multiAdditionRecursive(base, multiplier-1);
    }
//                              2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput > 10 || userInput < 1) {
            System.out.print("Please enter a valid number\n");
            return getInteger(min, max);
        }
        System.out.println("You picked: ");
        return userInput;
    }




    }











