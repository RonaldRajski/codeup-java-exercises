package UILPractice;

import java.util.ArrayList;
import java.util.List;

public class SampleQuestions {
    public static void main(String[] args) {
        for (int k = 0; k < 20; k = k + 2) {
            if (k % 3 == 1) {
            }
            System.out.println(k + " ");

            List<String> animals = new ArrayList<String>();
            animals.add("dog");
            animals.add("cat");
            animals.add("snake");
            animals.set(2, "lizard");
            animals.add(1, "fish");
            animals.remove(3);
            System.out.println(animals);
        }
    }

}
