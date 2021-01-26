import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i);
//            System.out.print(' ');
//            i++;
//        }

//        for (int i = 5; i <= 15; i++) {
//            System.out.printf("%d ", i);
//        }


        //        Do While Loop


//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        2
//        4
//        16
//        256
//        65536

//            for(int j = 2; j <=100; j+=2){
//                System.out.println(j);
//            }

//        int j = 0;
//        do {
//            j += 2;
//            System.out.println(j);
//        }

//            for(int k = 100; k>=-10; k-=5){
//                System.out.println(k);
//            }
//        while (j < 100);

//        int k = 105;
//        do {
//            k-=5;
//            System.out.println(k);
//        }
//        while(k > -10);

        //        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        for (long m =2; m <1000000; m*=m){
//            System.out.println(m);
//        }

//        long m = 2;
//        do{
//            System.out.println(m);
//            m *= m;
//
//        }
//        while(m < 1000000);










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

//        int i;
        boolean userSaysContinue = false;
////
//        do {
//
//            System.out.println("What number would you like to go up to?");
//            int input = scanner.nextInt();
//        System.out.println("\nHere is the number you entered!\n ");
//            System.out.print("number | squared | cubed\n" +
//                    "------ | ------- | ---\n");
//            for (int p = 1; p <= input; p++){
//                System.out.printf("%-6d | %-7d | %-5d%n", p, p*p, p*p*p);
////
////
////
////
//        }
//            System.out.println("\nWould you like to continue? [true/flase]");
//            userSaysContinue= scanner.nextBoolean();
//        } while (userSaysContinue);

        do{

        System.out.println("What is the numerical grade? (0-100)");
        int grade = scanner.nextInt();
        if(grade >= 88 && grade <101){
            System.out.println("A");
        }
        else if(grade >= 80 && grade <=87){
            System.out.println("B");
        }
        else if(grade >= 70 && grade <=79){
            System.out.println("C");
        }
        else if(grade >= 60 && grade<= 66){
            System.out.println("D");
        }
        else if(grade >= 0 && grade <= 59){
            System.out.println("F");
        }
        else{
            System.out.println("Invalid Number");
        }
        System.out.println("\nWould you like to continue? [true/flase]");
            userSaysContinue= scanner.nextBoolean();
        } while (userSaysContinue);




     }
}







