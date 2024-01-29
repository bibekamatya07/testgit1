package CoreJava.Class.CodeChallenge.UdemyChallenge.InheritanceChallenge;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = this.annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return Math.round(adjustedPay);
    }

    public void retire(){
        // end date should be the date employee retired
        terminate(LocalDate.now());
        isRetired = true;
    }
}
