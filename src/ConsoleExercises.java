import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("\nThe value of pi is approximately %.2f.\n", pi);




        Scanner scanner = new Scanner(System.in);
//        1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        int i = 0;
        while (i !=-1){
            System.out.print("Enter an integer: ");
            i = scanner.nextInt();
            System.out.println("\nThe number is " + i + ".\n");

        }

//        What happens if you input something that is not an integer?
//        Throws an exception in main error

//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        String string1, string2, string3;
//            Prompt

        System.out.println("Enter 3 words: ");

        string1 = scanner.next();
        string2 = scanner.next();
        string3 = scanner.next();

        System.out.printf("\n The words are \"%s\", \"%s\" and \"%s\".\n", string1, string2, string3);



//
//                What happens if you enter less than 3 words?
//                    breaks the code throws it into a loop
//                What happens if you enter more than 3 words?
//                Does not recognize the 4th word.

//       3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        String sentence;

        System.out.println("Enter a sentence: ");

        scanner.useDelimiter("\n");
////        need delimiter other wise scanner .next() only grabs the first line
//
        sentence = scanner.next();
//        sentence = scanner.nextLine();

        System.out.printf("\n Your sentence is: \"%s\".\n", sentence);

//        System.out.println("You entered: ");
//        System.out.println(sentence);
//
//        do you capture all the words? yes using a  delimeter


//        4. Rewrite the above example using the nextLine method.

        String sentence2;

        System.out.println("Enter a second sentence: ");
//        scanner.useDelimiter("\n"); // acts as next line between scanners
//        sentence = scanner.next(); //only returns first word UNLESS using delimiter
        sentence2 = scanner.nextLine(); // does not need delimiter
        System.out.println("The second sentence you entered: ");
        System.out.println(sentence2);


//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

//        double length;
//        double width;
//        double height;
//        System.out.println("Find the area and perimeter...");
//        System.out.println("Enter a lenght, width and height.  Do not put in units.");
//        length = scanner.nextDouble();
//        scanner.useDelimiter("\n");
//            length = Double.parseDouble(length);
//        width = scanner.nextDouble();
//        scanner.useDelimiter("\n");
//        width = Double.parseDouble(width);
//        height = scanner.nextDouble();
//        scanner.useDelimiter("\n");
//        height = Double.parseDouble(height);
//        System.out.println("The area is: ");
//        System.out.println(length * width);
//        System.out.println("The perimeter is: ");
//        System.out.println(2* length + 2 * width);
//        System.out.println("The volume is: ");
//        System.out.println(length * width * height);









    }
}







