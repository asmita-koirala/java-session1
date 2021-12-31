package day4;

public class BankEncapsulation {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setAccountNumber("1");
        account1.setAccountHolderName("Ram");
        account1.setAccountBalance(2000);

        Account account2 = new Account();
        account2.setAccountNumber("1");
        account2.setAccountHolderName("Ram");
        account2.setAccountBalance(1000);

        account1.addInterest(account1);

        System.out.println("****** Before Transfer*******");
        System.out.println("Account 2 : " + account2.getAccountBalance());
        System.out.println("Account 1 : " + account1.getAccountBalance());

        account1.transferBalance(account1, account2, 1000);

        System.out.println("****** After Transfer*******");
        System.out.println("Account 2 : " + account2.getAccountBalance());
        System.out.println("Account 1 : " + account1.getAccountBalance());
    }


}
