package practiceTest;

import java.util.Scanner;

public class Test {

    //public class Assessment {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number to square: ");
        int num = in.nextInt();
        System.out.println("Your number squared is: " + square(num));
    }
    public static int square(int num)
    {
        return num * num;
    }
}


class Sum
{
    public static void main(String[] arg)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        c=addition(a,b);
        System.out.println(" Addition of two numbers is : "+c);
    }
    static int addition(int x,int y)
    {
        return x+y;
    }
}


class Average {

    public static void main(String[] args) {

        int[] numbers = new int[]{10,20,15,25,16,60,100};


        int sum = 0;

        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        double average = sum / numbers.length;

        System.out.println("Average value of array elements is : " + average);
    }
}


//private String capitalize(final String line) {
//        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
//        }
