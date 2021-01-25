import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        };


        //        Do While Loop

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        2
//        4
//        16
//        256
//        65536


//        int i =100;


//        do{
//            System.out.println("i is " + i);
//            i+=2;
//            i-=5;
//        }
//        while(i<=100);
//        while(i>=0);
//        while(i < 1000000);


//        2. Fizzbuzz
//
//        for(long i = 1; i <= 100; i++){
//            if(i % 5 == 0 && i % 3 == 0)
//                System.out.println("FizzBuzz");
//            else if(i % 5 == 0)
//                System.out.println("Buzz");
//            else if(i % 3 == 0)
//                System.out.println("Fizz");
//            else
//                System.out.println(i);
//        }

        int i;
        String userInput;
        int baseInt;
        int maxInt;
        do {
            System.out.println("Enter an integer.");
            baseInt = scan.nextInt();
            System.out.println("What number would you like to go up to?");
            maxInt = scan.nextInt();
            System.out.print("number | squared | cubed\n" +
                    "---- | ----- | ---\n");
            for (i = baseInt; i <= maxInt; ++i){
                System.out.print(i + "\t| " + (i * i) + "\t| " + (i * i * i) + "\n");
        }
            System.out.println("\nWould you like to continue? [yes/no]");
            userInput = scan.next();
            ++i;
        } while (userInput.equals("yes"));





    }
}
