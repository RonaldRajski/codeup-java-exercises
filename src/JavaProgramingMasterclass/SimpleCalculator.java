package JavaProgramingMasterclass;




public class SimpleCalculator {

//    create instance variables with names firstNumber and secondNumber

    private double firstNumber;
    private double secondNuumber;

//    Method named getFirstNumber with no parameters
//            return firstNumber field

    public


    Method named getSecondNumber with no parameters
            return secondNumber field



//    public double getFirstNumber(){
//        return firstNumber;

    }
}




public double getFirstNumber(){
        return this.firstNumber;
        }

public double getSecondNumber(){
        return this.secondNumber;
        }

public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        }

public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
        }
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

public static void main(StringRepetition[] args) {
        practiceJava.SimpleCalculator calculator =new practiceJava.SimpleCalculator();
        calculator.setFirstNumber(9);
        calculator.setSecondNumber(22);
        System.out.println(calculator.getDivisionResult());
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getDivisionResult());
        System.out.println(calculator.getMultiplicationResult());
