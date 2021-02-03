package JavaProgramingMasterclass;




public class SimpleCalculator {

//    create instance variables with names firstNumber and secondNumber

    private double firstNumber;
    private double secondNumber;

//    Method named getFirstNumber with no parameters
//            return firstNumber field

    public double getFirstNumber() {
        return this.firstNumber;
    }

    //    Method named getSecondNumber with no parameters
//            return secondNumber field

    public double getSecondNumber() {
        return this.secondNumber;
    }

//Method set firstNumber with parameter of double type set value to first number field

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    //Method set secondNumber with parameter of double type set value to second number field

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        }


//        method get addition result 0 parameter add 2 numbers


public double getAdditionResult(){
        double sum =
        this.firstNumber + this.secondNumber;
        return sum;
        }

public double
        getSubtractionResult(){
        double sub =
        this.firstNumber - this.secondNumber;
        return sub;
        }
public double
        getMultiplicationResult(){
        double multiply =
        this.firstNumber * this.secondNumber;
        return multiply;
        }
public double getDivisionResult(){
        double division =
        this.firstNumber / this.secondNumber;
        if (this.secondNumber==0 ){
        return 0;
        }
        return division;
        }

public static void main(String[] args) {
    JavaProgramingMasterclass.SimpleCalculator calculator = new JavaProgramingMasterclass.SimpleCalculator();
    calculator.setFirstNumber(9);
    calculator.setSecondNumber(22);
    System.out.println(calculator.getDivisionResult());
    System.out.println(calculator.getAdditionResult());
    System.out.println(calculator.getDivisionResult());
    System.out.println(calculator.getMultiplicationResult());

}

}
