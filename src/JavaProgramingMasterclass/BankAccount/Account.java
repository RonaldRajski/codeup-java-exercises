package JavaProgramingMasterclass.BankAccount;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

//    constructors
    public Account(){
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999",100.55, customerName, customerEmailAddress,customerPhoneNumber );
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double witdrawalAmount){
        if(this.balance - witdrawalAmount <0){
            System.out.println("Only " + this.balance + " available.  Withdrawal not processed");
        }
        else {
            this.balance -= witdrawalAmount;
            System.out.println("Withdrawal of " +witdrawalAmount + "processed.  Remaining balance = " + this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}


