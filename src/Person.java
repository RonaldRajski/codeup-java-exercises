//class Person {
//    public String firstName;
//    public String lastName;
//    static long WORLD_POPULATION = 80000000L;
//    //        static means it belongs to the class, not owned by an instance of the class
//    public String sayHello() {//        this is a method
//        return String.format("Hello from %s %s!", firstName, lastName);
//
//    }
//    Person(){
//
//    }
//
//    Person(String firstName, String lastName){
////        this.firstName;
////        this.lastName;
//
//    }
//
//    public static void main(String[] args) {
//        Person fer = new Person();
////        fer is an instance of Person
//        fer.firstName = "Fernando";
//        fer.lastName = "Mendoza";
//        System.out.println(fer.sayHello());
////        Prints "Hello from Fernando Mendoza!"
//
//        Person chris = new Person();
//        chris.firstName = "Chris";
//        chris.lastName = "Cyr";
//        System.out.println(chris.sayHello());
//        System.out.println(Person.WORLD_POPULATION);
//    }
//}

public class Person{
    private String name;
    private  int age;

    public static void main(String[] args) {
//        Exercise 1
        Person ron = new Person("Ron");
        ron.age = 50;
        ron.sayHello();

        Person will = new Person("Will");
        will.age = 45;
        will.sayHello();


        Person bob = new Person("Bob");
        System.out.println(bob.getName());
        bob.setName("Bobby");
        bob.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        person1.getName().equals(person2.getName());
//        System.out.println(person1 == person2);
//
//
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());






    }
    public Person (String nameInput) {

        this.name = nameInput;
    }
        public String getName(){
            //TODO: return the person's name
        return this.name;
        }

        public void setName(String inputName) {
            //TODO: change the name property to the passed value
            this.name = inputName;
        }


        public void sayHello(){
            //TODO: print a message to the console using the person's name
            System.out.println("Hello, " + this.name + ". " + this.age + " is old:(");

        }





    }





