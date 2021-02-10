package greeter;

public class Greeter {
    private String fullName;
    private String greeting;

    public Greeter() {
        greeting = "Hello";
        fullName = "Codeup";
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String aName) {
        this.fullName = aName;
    }

    public String getGreeting() {
        return this.greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
