package Practice4.Chapter10;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Tork");
        course1.addStudent("Mickey Dolenz");
        course1.addStudent("Davey Jones");
        course1.addStudent("Michael Nesmith");


        course2.addStudent("Paul McCartney");
        course2.addStudent("George Harrison");
        course2.addStudent("Ringo Staar");
        course2.addStudent("John Lennon");
        course2.addStudent("Pete Best");

        System.out.println("Number of studnet is course1 " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.println(students[i] + " , ");

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

    }



}
