public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int months) {
        double i = interestRate / (100 * 12);
        double creditPayment = loanAmount * i / (1 - (Math.pow((1 + i), -months)));
        return (int) creditPayment;
    }

}
