package Practice4.Chapter6methods;

public class MethodDemo {
    public static int sum(int i1, int i2){
        int result = 0;
        for (int i = i1; i<=i2; i++)
            result += i;

            return result;

        }

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1,10));
        System.out.println("Sum from 20 to 37 is " + sum(20,37));
        System.out.println("Sum from 35 to 39 is " + sum(35,49));
    }
//
//    Write the definition of a method twice, which receives an int parameter and returns an int that is twice the value of the parameter.

    public static int twice(int x){
        return x*2;
    }

//    Write the definition of a method add, which receives two int parameters and returns their sum.

    public static int add(int a, int b){
        return a + b;
    }
//
//    Write the definition of a method powerTo, which receives two parameters. The first is a double and the second is an int. The method returns a double.
//
//    If the second parameter is negative, the method returns zero. Otherwise it returns the value of the first parameter raised to the power of the second parameter.

    public double powerTo(double a, int b){
        if(a < 0){
            return 0.0;
        }
        else {
            return Math.pow(a, (double) b);
        }
    }

//    Write the definition of a method min that has two int parameters and returns the smaller.

    public int min (int a, int b){
        return Math.min(a,b);
    }












    }

