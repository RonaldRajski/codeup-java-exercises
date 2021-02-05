package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        ArrayList<ArrayList<Double>> allGrades = new ArrayList<>();
        System.out.println(allGrades.size());



        ArrayList<Double> vincentGrades = new ArrayList<>();
        vincentGrades.add(100.);
        vincentGrades.add(82.);
        vincentGrades.add(90.);
        vincentGrades.add(90.);
        Student vincent = new Student("Vincent \"Foot Massage\" Vega", vincentGrades, "RoyaleWithCheese");
        students.put("Vincent", vincent);
        allGrades.add(0,vincentGrades);

        ArrayList<Double> winstonGrades = new ArrayList<>();
        winstonGrades.add(66.);
        winstonGrades.add(69.);
        winstonGrades.add(65.);
        winstonGrades.add(64.);
        Student winston = new Student("Winston \"You are a Character\" Wolf", winstonGrades, "oakFurniture");
        students.put("Winston", winston);
        allGrades.add(1,winstonGrades);

        ArrayList<Double> julesGrades = new ArrayList<>();
        julesGrades.add(110.);
        julesGrades.add(110.);
        julesGrades.add(110.);
        julesGrades.add(110.);
        Student jules = new Student("Walk the Earth Jules Winnfield", julesGrades, "badmf");
        students.put("Jules", jules);
        allGrades.add(2,julesGrades);

        ArrayList<Double> marcellusGrades = new ArrayList<>();
        marcellusGrades.add(50.);
        marcellusGrades.add(50.);
        marcellusGrades.add(50.);
        marcellusGrades.add(50.);
        Student marcellus = new Student("\"Bossman\" Marcellus \"Go down in the 5th\" Wallace", marcellusGrades, "briefcase");
        students.put("Marcellus", marcellus);
        allGrades.add(3,marcellusGrades);

        ArrayList<Double> miaGrades = new ArrayList<>();
        miaGrades.add(50.);
        miaGrades.add(50.);
        miaGrades.add(50.);
        miaGrades.add(50.);
        Student mia = new Student("\"Boss's lady\" Mia \"They talk a lot don't they\" Wallace", miaGrades, "shake");
        students.put("Mia", mia);
        allGrades.add(3,miaGrades);

//        TERMINAL SCANNER ---------->
        Scanner scanner = new Scanner(System.in);
        System.out.println("It is not just fiction, it is Pulp Fiction");
        System.out.println("..Welcome to Quentin Land..");
        System.out.println("Below are a list of usernames:");
        System.out.println("| " + students.get("Marcellus").getGitHubName() + " | " + students.get("Jules").getGitHubName() + " | " + students.get("Winston").getGitHubName() + "| " + students.get("Vincent").getGitHubName() + " | " + students.get("Mia").getGitHubName());
        System.out.println("Enter one of the usernames to find out more about that Mobster or enter \"All\" to view the class average: ");
        String userInput = scanner.nextLine();
        while (true) {
            if(userInput.equalsIgnoreCase("all")){
                System.out.println("The class average is: " + allGrades);
            }






            if (userInput.equalsIgnoreCase("briefcase")) {
                System.out.println("You have selected: " + students.get("Marcellus").getName() + "!");
                System.out.println("His grades were: " + students.get("Marcellus").getGrades(marcellusGrades));
                System.out.println("His gpa was: " + students.get("Marcellus").getGradeAverage(marcellusGrades));
                System.out.println("Feel that sting, that's pride...F pride\n");
                System.out.println("Would you like to see another mobster? Yes or No:");
                String userInput2 = scanner.nextLine();
                if (userInput2.toLowerCase().startsWith("n")) {
                    System.out.println("Ezekiel 25:17\n" +
                            "The path of the righteous man is beset on all sides\n" +
                            "By the inequities of the selfish and the tyranny of evil men\n" +
                            "Blessed is he who, in the name of charity and good will\n" +
                            "Shepherds the weak through the valley of darkness\n" +
                            "For he is truly his brother's keeper and the finder of lost children\n" +
                            "And I will strike down upon thee\n" +
                            "With great vengeance and furious anger\n" +
                            "Those who attempt to poison and destroy my brothers\n" +
                            "And you will know my name is the Lord\n" +
                            "When I lay my vengeance upon thee");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.equalsIgnoreCase("badmf")) {
                System.out.println("You have selected: " + students.get("Jules").getName() + "!");
                System.out.println("His grades were: " + students.get("Jules").getGrades(julesGrades));
                System.out.println("His gpa was: " + students.get("Jules").getGradeAverage(julesGrades));
                System.out.println("Get my wallet, it is the one that says bad MF\n");
                System.out.println("Would you like to see another mobster? Yes or No:");
                String userInput3 = scanner.nextLine();
                if (userInput3.toLowerCase().startsWith("n")) {
                    System.out.println("Ezekiel 25:17\n" +
                            "The path of the righteous man is beset on all sides\n" +
                            "By the inequities of the selfish and the tyranny of evil men\n" +
                            "Blessed is he who, in the name of charity and good will\n" +
                            "Shepherds the weak through the valley of darkness\n" +
                            "For he is truly his brother's keeper and the finder of lost children\n" +
                            "And I will strike down upon thee\n" +
                            "With great vengeance and furious anger\n" +
                            "Those who attempt to poison and destroy my brothers\n" +
                            "And you will know my name is the Lord\n" +
                            "When I lay my vengeance upon thee");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.equalsIgnoreCase("oakfurniture")) {
                System.out.println("You have selected: " + students.get("Winston").getName() + "!");
                System.out.println("His grades were: " + students.get("Winston").getGrades(winstonGrades));
                System.out.println("His gpa was: " + students.get("Winston").getGradeAverage(winstonGrades));
                System.out.println("It is 30 minutes away.  I will be there in 10.\"\n");
                System.out.println("Would you like to see another mobster? Yes or No:");
                String userInput4 = scanner.nextLine();
                if (userInput4.toLowerCase().startsWith("n")) {
                    System.out.println("Ezekiel 25:17\n" +
                            "The path of the righteous man is beset on all sides\n" +
                            "By the inequities of the selfish and the tyranny of evil men\n" +
                            "Blessed is he who, in the name of charity and good will\n" +
                            "Shepherds the weak through the valley of darkness\n" +
                            "For he is truly his brother's keeper and the finder of lost children\n" +
                            "And I will strike down upon thee\n" +
                            "With great vengeance and furious anger\n" +
                            "Those who attempt to poison and destroy my brothers\n" +
                            "And you will know my name is the Lord\n" +
                            "When I lay my vengeance upon thee");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.equalsIgnoreCase("royalewithcheese")) {
                System.out.println("You have selected: " + students.get("Vincent").getName() + "!");
                System.out.println("His grades were: " + students.get("Vincent").getGrades(vincentGrades));
                System.out.println("His gpa was: " + students.get("Vincent").getGradeAverage(vincentGrades));
                System.out.println("A five dollar milkshake?? and you do not put bourbon in it or nothing?\n");
                System.out.println("Would you like to see another mobster? Yes or No:");
                String userInput5 = scanner.nextLine();
                if (userInput5.toLowerCase().startsWith("n")) {
                    System.out.println("Ezekiel 25:17\n" +
                            "The path of the righteous man is beset on all sides\n" +
                            "By the inequities of the selfish and the tyranny of evil men\n" +
                            "Blessed is he who, in the name of charity and good will\n" +
                            "Shepherds the weak through the valley of darkness\n" +
                            "For he is truly his brother's keeper and the finder of lost children\n" +
                            "And I will strike down upon thee\n" +
                            "With great vengeance and furious anger\n" +
                            "Those who attempt to poison and destroy my brothers\n" +
                            "And you will know my name is the Lord\n" +
                            "When I lay my vengeance upon thee");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.equalsIgnoreCase("shake")) {
                System.out.println("You have selected: " + students.get("Mia").getName() + " ! ");
                System.out.println("Her grades were: " + students.get("Mia").getGrades(miaGrades));
                System.out.println("Her gpa was: " + students.get("Mia").getGradeAverage(miaGrades));
                System.out.println("It was a teenage wedding and the old folks wished them well...\n");
                System.out.println("Would you like to see another mobster? Yes or No:");
                String userInput2 = scanner.nextLine();
                if (userInput2.toLowerCase().startsWith("n")) {
                    System.out.println("Ezekiel 25:17\n" +
                            "The path of the righteous man is beset on all sides\n" +
                            "By the inequities of the selfish and the tyranny of evil men\n" +
                            "Blessed is he who, in the name of charity and good will\n" +
                            "Shepherds the weak through the valley of darkness\n" +
                            "For he is truly his brother's keeper and the finder of lost children\n" +
                            "And I will strike down upon thee\n" +
                            "With great vengeance and furious anger\n" +
                            "Those who attempt to poison and destroy my brothers\n" +
                            "And you will know my name is the Lord\n" +
                            "When I lay my vengeance upon thee");
                    return;
                } else {
                    main(args);
                }

            } else {
                System.out.println("Sorry, I don't recognize that username...please try again:\n");
                main(args);
            }
        }
    }
}