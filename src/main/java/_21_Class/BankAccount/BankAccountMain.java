package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
//        bankAccount.deposit(4000);
        bankAccount.withdraw(2500);
        System.out.println(bankAccount.getBalance());
    }
}
