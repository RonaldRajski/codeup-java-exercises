package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        //   add light, medium, medium, dark to the array list, one at a time
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);

        // 2. Check to see if the list contains "dark" , and then "espresso"

        boolean result;
        result = roasts.contains("dark");
        System.out.println(result ? "Contains dark!" : "Does not contain dark!");

        result = roasts.contains("expresso");
        System.out.println(result ? "Contains expresso" : "Does not contain expresso");

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
        System.out.println("The last index of 'medium' is: " + index);
        // 4. Check if the array list is empty
        if (roasts.isEmpty()) {
            System.out.println("The roasts list is empty");
        } else {
            System.out.println("The roasts lis is not empty! Java FTW");
        }

        System.out.println(roasts.isEmpty() ? "01 List is empty" : "01 List is NOT empty");

        // 5. Assign the array list an empty ArrayList object, and then check if empty

        roasts = new ArrayList<>();
        System.out.println(roasts.isEmpty() ? "02 List is empty" : "02List is NOT empty");


        // 6. Remove the espresso roast
        roasts.add("light");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.remove("expresso");
        System.out.println("Original roasts " + roasts);


        System.out.println("Roasts now looks like: " + roasts);


//        boolean keepGoing = roasts.contains("light") {
//            while (keepGoing) {
//                if (roasts.contains("light")) {
//                    roasts.remove("light");
//                } else {
//                    keepGoing = false;
//                }
//            }
//        }

        // 7. Remove the element at index 2
//        roasts.remove(index: 2);
//        System.out.println("After removing index 2, roasts = "+ roasts);



        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username

        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Casey", "Fridaynext");
        usernames.put("Daniel", "danilefryar");

        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();

        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map

        usernames.put("Casey", "Fridaynext");


        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Casey");
        System.out.println(usernames);
        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        usernames.replace("Daniel", "danielfryardev");
        System.out.println(usernames);
        // 8. Use the .clear() method to clear the map
        usernames.clear();
        System.out.println(usernames.isEmpty() ? "Hashmap empty!" : "Hashmap ! empty");
        // 9. Use the .isEmpty() method to verify that it was cleared


    }
}