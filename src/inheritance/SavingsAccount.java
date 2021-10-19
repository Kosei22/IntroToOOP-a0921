package inheritance;


public class SavingsAccount extends BankAccount {
    private int transactions;

    public SavingsAccount(String accountNumber, double balance, int bankCode, int transactions) {
        super(accountNumber, balance, bankCode);
        this.transactions = transactions;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }
}
