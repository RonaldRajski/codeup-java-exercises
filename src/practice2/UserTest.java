package practice2;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Cory", "Imel",true);
        System.out.printf("Is %s %s an admin?: %s %n",user.getFirstName(),user.getLastName(),user.isAdmin());
    }

}
