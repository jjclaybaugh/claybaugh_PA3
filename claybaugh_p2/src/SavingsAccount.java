public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest() {
        double interest;
        interest = ((savingsBalance * (annualInterestRate/100))/12);
        savingsBalance += interest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public void printAccountBalance() {
        System.out.printf("$%.2f", savingsBalance);
    }

    public SavingsAccount(double BalanceValue)
    {
        annualInterestRate = 0.0;
        savingsBalance =  BalanceValue;
    }
}
