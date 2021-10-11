public class CreditPaymentService {
    public int calculate(int creditAmount, double annualInterestRate, int creditPeriod) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double annuityPaymentRatio = monthlyInterestRate + (monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, creditPeriod) - 1));
        int monthlyPayment = (int) (creditAmount * annuityPaymentRatio);
        return monthlyPayment;
    }
}

