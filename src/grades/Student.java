package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private String gitHubName;
    private ArrayList<Double> grades = new ArrayList<>();



    public static void main(String[] args) {
        ArrayList<Double> ronGrades = new ArrayList<>();
        Student ron = new Student("Ron", ronGrades, "ronaldrajski");
        ronGrades.add(90.00);
        ronGrades.add(80.00);
        ronGrades.add(60.00);
        System.out.printf("%s's grades are: " + ronGrades + ".\n", ron.name);
        System.out.printf("%s's average is: " + ron.getGradeAverage(ronGrades), ron.name);
    }

    public Student(String name, ArrayList <Double> grades, String gitHubName) {
        this.name = name;
        this.grades = grades;
        this.gitHubName = gitHubName;
    }

    public void setName(String name) {
        this.name = name;
        addGrade(grades);
    }

    public String getName() {
        return this.name;
    }

    public String getGitHubName() {
        return this.gitHubName;
    }

    public void addGrade(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public ArrayList<Double> getGrades(ArrayList<Double> grades){
        return grades;
    }
    public double getGradeAverage(ArrayList<Double> grades) {
        Double sum = 0.0;
        if (!grades.isEmpty()) {
            for (Double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return sum;
    }
}
