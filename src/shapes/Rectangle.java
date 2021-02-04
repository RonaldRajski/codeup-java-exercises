package shapes;


    public class Rectangle extends Quadrilateral implements Measurable {
        public Rectangle(double length, double width) {
            super(length, width);
        }

        @Override
        protected double setLength(double length) {
            return length;
        }

        @Override
        protected double setWidth(double width) {
            return width;
        }

        @Override
        public double getPerimeter() {
            return 2 * (this.length + this.width);
        }

        @Override
        public double getArea() {
            return this.length * this.width;
        }




}



//

