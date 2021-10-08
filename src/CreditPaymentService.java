public class CreditPaymentService {
    public int calculate(int creditAmount, double interestRate, int creditPeriod) {
       int monthlyPayment = (int) (creditAmount * (interestRate / 12 / 100 + ((interestRate / 12 / 100) / (Math.pow(1 + interestRate / 12 / 100, creditPeriod) - 1))));
        return monthlyPayment;
    }
}

