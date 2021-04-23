package Practice4.Chapter10;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanamount;
    private java.util.Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanamount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanamount = loanamount;
    }

    public Loan() {
        this(2.5, 1, 1000);
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

    public double getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(double loanamount) {
        this.loanamount = loanamount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanamount * monthlyInterestRate/ (1-(1/ Math.pow(1+ monthlyInterestRate, numberOfYears *12)));
        return monthlyPayment;
    }
//    total payment
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }



}

