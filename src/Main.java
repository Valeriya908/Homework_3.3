public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentForOneYear = service.calculate(1_000_000, 9.99, 12);
        System.out.println(monthlyPaymentForOneYear);

        int monthlyPaymentForTwoYears = service.calculate(1_000_000, 9.99, 24);
        System.out.println(monthlyPaymentForTwoYears);

        int monthlyPaymentForThreeYears = service.calculate(1_000_000, 9.99, 36);
        System.out.println(monthlyPaymentForThreeYears);
    }
}

