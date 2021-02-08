package JavaProgramingMasterclass.BankAccount;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.0, "Bob Brown", "myEmailAddress.com", "(210) 123-4567");

//        all the stuff below  is possible because of
//
//        public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
//            this.number = number;
//            this.balance = balance;
//            this.customerName = customerName;
//            this.customerEmailAddress = customerEmailAddress;
//            this.customerPhoneNumber = customerPhoneNumber;
//
//            found in account.java

//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipPerson person1= new VipPerson();
        System.out.println(person1);

        VipPerson person2 = new VipPerson("Bob",25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());






        }
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(210) 123-4567");



    }


