package JavaProgramingMasterclass.CarpetClassCalculator;

public class Carpet {

    private double cost;



    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else if (cost >= 0) {
            this.cost = cost;
        }
    }

//        Methods

        public double getCost() {
            return this.cost;
        }

    }


