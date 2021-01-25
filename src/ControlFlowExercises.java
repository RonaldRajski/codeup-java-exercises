import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 5;
        while (i < 16){
            System.out.println( i);
            i++;
        };

        //        Do While Loop

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        2
//        4
//        16
//        256
//        65536

        int i = 10;
        int i =100;
        long i = 2;

        do{
            System.out.println("i is " + i);
            i+=2;
            i-=5;
        }
        while(i<=100);
        while(i>=0);
        while(i < 1000000)




    }
}
