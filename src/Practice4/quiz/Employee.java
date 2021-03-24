package Practice4.quiz;

class Employee extends Person {
    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;

//        nameOfthe
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Peter Gibbons", "IT");
        System.out.println(emp.getName() + "works in " + emp.getDepartment());
    }

}
