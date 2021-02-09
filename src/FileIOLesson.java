import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("languages.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
    }
}

        // 1. Create a class named FileIOLesson
        // 2. Do your work inside of a main method
        // 3. Write Java code to create a file named languages.txt. Specify languages.txt as a relative path (Paths.get("languages.txt")).
        //    Where is this file created after you run your code?
        // 4. Run your code that creates the languages.txt file again. What happens when you try to create a file that already exists?
        // 5. Update your code to check for the presence of languages.txt before creating it.




