package greeter;

public class GreeterApplication {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
        System.out.println(greeter.getFullName());

        greeter.setFullName("Doug");
        greeter.setGreeting("Howdy");
        System.out.println(greeter.getGreeting());
        System.out.println(greeter.getFullName());
    }
}
