import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(3, 1));
//        System.out.println(multiplication(2, 4));
//        System.out.println(division(6, 3));
//        System.out.println(modulus(25, 5));
//        System.out.println(multiAddition(7, 0));
//        System.out.println(multiAdditionRecursive(5, 8));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());
//
//
//
//    }
//
//
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//
//    }

//    Bonus
//
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).

//    public static int multiAddition(int base, int multiplier) {
//        int total = 0;
//        for (int i = 0; i < multiplier; i++) {
//            total += base;
//        }
//        return total;
//    }
//
//    public static long multiAdditionRecursive(int base, int multiplier) {
//        if (base == 0 || multiplier == 0) {
//            return 0;
//        }
//        return base + multiAdditionRecursive(base, multiplier - 1);
    }
//
//                                      2
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        if (userInput > 10 || userInput < 1) {
//            System.out.print("Please enter a valid number\n");
//            return getInteger(min, max);
//        }
//        System.out.println("You picked: ");
//        return userInput;
//    }

//    3. calculate the factorial of a number

//    public static long factorial() {
//        Scanner scanner = new Scanner(System.in);
//        long recalculate;
//        do {
//            System.out.print("Enter an integer between 1 and 49: ");
//
//            long userInput = scanner.nextInt();
//            long total = 1;
//            for (long i = 1; i < userInput; i++) {
//                if (userInput < 50) {
//                    total *= i;
//                } else {
//                    System.out.println("Please enter a valid number");
//                    return factorial();
//                }
//            }
//            System.out.print(userInput + "! total is: " + (userInput * total));
//            System.out.println("\nEnter 1 to calculate another factorial, or 0 to exit.");
//            recalculate = scanner.nextInt();
//        } while (recalculate == 1);
//        return recalculate;
//    }

        //    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice,
// display the results of each,
// and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the
//            random numbers.

//        public static long dice(long num1) {
//            Scanner getnum = new Scanner(System.in);
//            System.out.print("Enter the number of sides one of your di: ");
//            num1 = getnum.nextInt();
//            System.out.println("Type 1 to roll the dice! ");
//            int num17 = getnum.nextInt();
//            boolean confirmation = (num17 == 1);
//            if (confirmation) {
//                int dice1 = (int) Math.ceil(num1 * java.lang.Math.random());
//                int dice2 = (int) Math.ceil(num1 * java.lang.Math.random());
//                double diceRoll = ((num1 * java.lang.Math.random()));
//                long diceResult = (Math.round(diceRoll));
//                System.out.println("You rolled " + dice1 + " & " + dice2 + "!");
//                System.out.println("Play again? 1 for Yes | 2 for No");
//                int playAgain = getnum.nextInt();
//                boolean confirm = (playAgain == 1);
//                if (confirm) {
//                    dice(num1);
//                } else {
//                    System.out.println("Goodbye");
//                    return diceResult;
//                }
//            } else {
//                System.out.println("You failed, Goodbye");
//                return num17;
//            }
//            return (num1);
        }
























