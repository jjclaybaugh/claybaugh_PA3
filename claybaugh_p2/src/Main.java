public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);

        for (int i = 0; i < 13; i++){
            if (i < 12){
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
                System.out.printf("Month " + (i + 1) + ":\t");
                saver1.printAccountBalance();
                System.out.print("\t");
                saver2.printAccountBalance();
                System.out.println();
            }
            else{
                SavingsAccount.modifyInterestRate(5.0);

                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();

                System.out.print("Month 13: \t");
                saver1.printAccountBalance();
                System.out.print("\t");
                saver2.printAccountBalance();
                System.out.println();
            }
        }
    }
}
