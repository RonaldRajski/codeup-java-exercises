import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Arrays;

// 1. Create a class named FileIOLesson
// 2. Do your work inside of a main method
// 3. Write Java code to create a file named languages.txt. Specify languages.txt as a relative path (Paths.get("languages.txt")).
//    Where is this file created after you run your code?
// 4. Run your code that creates the languages.txt file again. What happens when you try to create a file that already exists?
// 5. Update your code to check for the presence of languages.txt before creating it.


public class FileIOLesson {
    public static void main(String[] args) throws IOException {
//        Path filePath = Paths.get("languages.txt");
//        if (!Files.exists(filePath)) {
//            Files.createFile(filePath);
//        }


//        1. Create a variable named languages that is a list of strings. Each string should be one programming language that you know.
//        1. Write the code to add the programming languages you know, each on a seperate line, to languages.txt.
//        1. Run your code and open the languages.txt file. What do you notice?
//        1. Re-run your code that adds the languages. Open the languages.txt file again. What do you notice?
//        1. Modify your languages variable and remove one of the languages. Re-run your code and inspect the languages.txt file. What do you notice?


//        String [] languages = {"html", "css", "javascript", "java"};
//        Path filePath = Paths.get("languages.txt");
//        Path Files.write(Path filepath, List<languages> lines[, StandardOpenOption option]);


//        Path filepath = Paths.get( "languages.txt");
//        List<String> languages = Arrays.asList
//                ("html", "javascript", "css", "java", "SQL"
//                );
//        Files.write(filepath, languages, StandardOpenOption.APPEND);

        Path filepath = Paths.get("languages.txt");
        List<String> lines = Files.readAllLines(filepath);

        for (String line : lines){
            System.out.println("Here is a language I like: " + line);
            if(line.equals("javascript")) {
                System.out.println("This is my favorite language!");

            }
        }

//        Prints out everything in console

    }
}








