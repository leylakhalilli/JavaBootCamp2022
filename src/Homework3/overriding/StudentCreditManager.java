package Homework3.overriding;

public class StudentCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double tutar) {
        return tutar * 1.10;

    }
}
