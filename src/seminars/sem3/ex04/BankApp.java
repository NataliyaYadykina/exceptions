package seminars.sem3.ex04;

public class BankApp {

    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        try {
            account1 = new Account(11111111111111L, 900);
            System.out.println(account1);
            account2 = new Account(22222222222222L, 100000);
            System.out.println(account2);
            account3 = new Account(33333333333333L, -500);
            System.out.println(account3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.deposit(-40);
            System.out.println(account1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.deposit(40);
            System.out.println(account1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.withdraw(-40);
            System.out.println(account1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.withdraw(1040);
            System.out.println(account1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.withdraw(100);
            System.out.println(account1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
