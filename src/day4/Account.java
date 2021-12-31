package day4;

public class Account {

    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private final float INTEREST_RATE = 0.05f;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public void transferBalance(Account fromAccount, Account toAccount, double amountToBeTransfered){
        //TODO: check balance before transfer
        fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amountToBeTransfered);
        toAccount.setAccountBalance(toAccount.getAccountBalance() + amountToBeTransfered);
    }
     public void addInterest(Account account){

        double interest =(account.getAccountBalance() * 1 * INTEREST_RATE);
        System.out.println("Interest amount: "+ interest);
        account.setAccountBalance(account.getAccountBalance() + interest);
        System.out.println("Account 1: "+ account.getAccountBalance());

    }
}

