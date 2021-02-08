package JavaProgramingMasterclass.BankAccount;

public class VipPerson {

//    create 3 fields or instances

    private String name;
    private double creditLimit;
    private String emailAddress;

//    create 3 constructors

    public VipPerson(){
        this("Default name", 50000.00, "default@email.com");
    }


    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;


    }
}

