package Practice4.Chapter10;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
//    private java.util.Date loanDate;


    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", loanAmount=" + loanAmount +
                '}';
    }

    public Loan(){
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

        public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/ (1-(1/ Math.pow(1+ monthlyInterestRate, numberOfYears *12)));
        return monthlyPayment;
    }
//    total payment
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
//    public java.util.Date getLoanDate() {
//        return loanDate;
//    }



}

