package syntax;

public class SyntaxLecture {


//    psvm is the shortcut
    public static void main(String[] args) {



        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations

        int number;
//        = is just assignment in Java
//        == is assignment/value
//        === is assignment/value/type


        // Assignment expressions
        number = 7;


        // Any use of ++ or --

//
//        pre-decrement
        --number;
        System.out.println("number's value after pre-decrementing is:" + number);
//        post-increment
        number++;
        System.out.println("number's value after post-decrementing is:" + number);


       System.out.println("pre-decrementing " + number + " = " + ++number);

        System.out.println("post-incrementing " + number + " = " + number++);
        System.out.println("Now the number =" + number);


        // Method invocations
        Math.random();

//        assign random number to variable

//        number = Math.random();
        double randomNumber = Math.random();

        System.out.println(randomNumber);


        // Object creation expressions

        // ================== COMMENTS (s-4)

//        see JavaDocTest in docs package

        // ================== DATA TYPES (s-5, 6, 7)

        // use the smallest type needed for the job

        // primitive types...

            byte age = 125;
        System.out.println("Adding one to the Byte(125) : " + age++);
        System.out.println("Adding one to the Byte(127) : " + age++);
//        Loops back around to -128

//        System.out.println(age);
            short minimumAnnualSalary = 15080;
        System.out.println("Adding one to the salary: " + ++minimumAnnualSalary);


            int distanceToSaturn = 1200000000;


            long numberOfHumanCells = 3000000000L; // L needed for compiler
            System.out.println(numberOfHumanCells);
            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
            System.out.println(lengthOfBacteriaInInches);
            double widthOfAtomInMeters = .00000000001;
            char seatingSection = 'M'; // must wrap in single quotes
            boolean everythingIsAwesome = false;
            if(false){
                System.out.println("Everything is Awesome");
            }
            if(!everythingIsAwesome){
                System.out.println("Everything is NOT Awesome");
            }

        // strings (not a primitive type)

                 String thisIsAString = "Hello";
                    String anotherString = "Hello";

                    if(thisIsAString == anotherString){
                        System.out.println("The two are equal, from double equals");
                    }

        if (thisIsAString.equals(anotherString)) {
            System.out.println("We used .equals, they are equivalent");

        }

        if(thisIsAString == "Hello"){
            System.out.println("We used .equals, they are equivalent");

        }



//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting

        System.out.println("hello\nWorld");
        System.out.println("Hello");
        System.out.println("World");

        System.out.println("Hello, \"groovy\"World");

//        char someLetter = "Y";
//        System.out.println(someLetter);

        String myName = "Casey";
        System.out.println(myName.charAt(0));


        // ================== VARIABLES (s-8)

        // declaration separate from initialization

        // declaration and initialization

        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum

        // ================== CONSTANTS (s-10)

        // see curriculum

        // ================== EXPRESSIONS (s-11)

        // basically the same as JS

        // ================== OPERATORS (s-12)

        // basically the same as JS

        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/

        // IMPLICIT

        // EXPLICIT

        // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;


        // explicit casting - more to less explicit casting (narrowing)

//                 double num3 = 3.1;
//                 float num4 = (float) num3;
//
//                System.out.println(num4);

    }
}

