import java.util.Scanner;


public class MethodsLec {
//    MethodStructure
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractNumbers(int num1, int num2){
        return num1-num2;
    }

    public static void main(String[] args) {

//        Static

        int sum =MethodsLec.addNumbers(2,3);
        System.out.println("Using our static method");
        System.out.println(sum);

        double squareNumber = Math.pow(3,2);

//        non-static

        MethodsLec matWiz = new MethodsLec();
        int difference = matWiz.subtractNumbers(10,6);
        System.out.println("Using a non-static method");
        System.out.println(difference);

        MethodsLec.tenureMessage("Casey", "PHP", 11);

    }

    public static String tenureMessage(String name, String proLang, int numYears){
//        String thePersonName = name;

        return "X has done Y for 2 years";

//        System.out.println(name + " has been coding" +proLang + "for" + numYears +  " years");

    }

}
