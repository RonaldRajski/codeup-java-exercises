package abstract_and_interfaces;

import inheritance_poly.Employee;

import java.util.SortedMap;

public class Programmer extends Employee {

    public Programmer(String employeeName){
        super(employeeName);
    }

    @Override
    public void doWork(){
        System.out.println("console.log('Hello, World');");
    }


}
