package ch12_encapsulation.bankAccount;

public class BankAccountTest {
    static void main() {
        BankAccount account = new BankAccount("1",5000,"1234");

        account.printInfo();

        account.deposit(500);
        account.deposit(-100); //error

        account.getBalance();

        account.withdraw(9600); //error
        account.withdraw(1000);

        account.setPin("4321");

        account.printInfo();
    }
}
