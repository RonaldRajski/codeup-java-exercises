package practiceTest2;

public class Person implements Greeter{
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {

        if(firstName == null || lastName == null){
            throw new IllegalArgumentException("A null entry is not allowed here.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String sayHello() {
        return String.format("Hello %s %s%n",this.firstName,this.lastName) ;
    }
}
