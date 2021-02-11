package JavaProgramingMasterclass.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1, 5,5);

        Dog dog = new Dog("Yorkie",1,1,8,20,2,4,1,24,"long silky");

        Fish fish = new Fish("Goldie",3,2,6,2,4);


        dog.eat();
//        dog.walk();
        dog.run();

//        fish.swim();

    }
}
