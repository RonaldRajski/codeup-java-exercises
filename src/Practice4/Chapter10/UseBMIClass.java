package Practice4.Chapter10;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("John Doe", 18, 145,70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Peter King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());

        BMI bmi3 = new BMI("Joey Ski", 250, 72);
        System.out.println("The BMI for " + bmi3.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
    }

