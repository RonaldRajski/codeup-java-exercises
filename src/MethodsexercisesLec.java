import java.util.Scanner;


public class MethodsexercisesLec {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Your answer is undefined");
            return 0.0;
        }
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
    //    get a number within a range
    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number" + min+ " and " + max);
        int userInput = input.nextInt();
        if (userInput >=min && userInput <= max){
            System.out.println("Great job - you chose a valid number!");
            return userInput;
        }
        else{
            System.out.println("That number was not within range of " + min+ " - " + max);
            System.out.println("Please try again");
            return getInteger(min, max);


        }
    }

//    public static void getFactorial(int min, int max){
//        int factBase = getInteger(min, max);
//        for(in i = 1; i<=factBase; i++){
//            factorial *= i;
//            System.out.println(i + "! = " + getVisualFactorial(i) + " = " + factorial);
//        }
//
//    }
//    public static String getVisualFactorial(int base){
//        String visulaFact = "1";
//
//        if(base ==1){
//            return visulaFact;
//        }
//        for(int i =2; i<=base; i++){
//            visulaFact = visulaFact+ "x" + i;
//        }
//        return visualFact;
//    }






    public static void main(String[] args) {
        System.out.println(add(2,2));
        System.out.println(subtract(2,2));
        System.out.println(multiply(2,2));
        System.out.println(divide(2,2));
        System.out.println(modulus(2,2));
//        Test getting number in range
        System.out.println("The number your picked was:" + getInteger(1,10));
        getInteger(37, 105);

    }

}
