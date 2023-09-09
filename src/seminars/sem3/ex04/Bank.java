package seminars.sem3.ex04;

import java.util.HashSet;

public class Bank {

    HashSet<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void withdraw(Account account, int sum) {
        try {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
