package Practice4.Chapter6methods;

public class TestReturnGradeMethod{
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(78.5) + ".");
        System.out.println("\nThe grade is " + getGrade(59.5) + ".");
    }

    public static char getGrade(double score) {
        if(score >=90)
            return 'A';
        else if(score >= 80)
            return 'B';
        else if(score >= 70)
            return 'C';
        else if(score >= 60)
            return 'D';
        else
            return 'F';
    }

    public static void printDottedLine() {
        System.out.println("....");

    }

    public static void printGrade(char ch){
        System.out.println("Grade: " + ch);
    }

    public static void dashedLine(int n){
        for(int i = 0; i <n; i++)
            System.out.println('-');
        System.out.println();
    }

}
