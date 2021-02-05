package inheritance_poly;

public class Employee extends Person{

    private double salary;

    public Employee(String employeesName){
        super(employeesName);
//        super keyword has access to everything that is not private
        super.phone = "000-000-0000";

    }

    public void doWork(){
        System.out.println("Work. work...");
    }

//    method overriding

    @Override
    public void sayHello(){
        System.out.println("How can I help you?  You can reach out at: " + this.phone);
    }




}
