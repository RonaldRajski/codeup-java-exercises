package practice2;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John", "Oliver");
        System.out.printf("Hi %s %s%n",person.getFirstName(),person.getLastName());
        person.setFirstName("Cory");
        person.setLastName("Imel");
        System.out.printf("Hi %s %s%n",person.getFirstName(),person.getLastName());
        System.out.println(person.sayHello());
//        Person person1 = new Person("Guy",null);
    }
}
