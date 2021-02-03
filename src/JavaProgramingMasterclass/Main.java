package JavaProgramingMasterclass;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        Car ford = new Car();



        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());


        ford.setModel("Shelby Mustang");
        System.out.println("Model is " + ford.getModel());


    }
}
