public class CarFest {
    public static void main(String[] args) {
        Car lightningMcQueen = new Car();
        lightningMcQueen.make = "Chevy";
        lightningMcQueen.model = "Corvette";
        lightningMcQueen.year = 2006;
        System.out.println(lightningMcQueen.go());

        System.out.println(lightningMcQueen.go());
    }
}
