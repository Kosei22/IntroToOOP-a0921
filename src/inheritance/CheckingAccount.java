package inheritance;


public class CheckingAccount extends BankAccount {
    private long limit;

    public CheckingAccount(String accountNumber, double balance, int bankCode, long limit) {
        // YOU MUST HAVE THIS CONSTRUCTOR! super()
        super(accountNumber, balance, bankCode);
        this.limit = limit;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }
}
