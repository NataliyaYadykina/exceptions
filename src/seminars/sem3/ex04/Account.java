package seminars.sem3.ex04;

import seminars.sem2.ex04.NegativeNumbersException;

public class Account {

    private long number;
    private int amount;

    public Account(){

    }

    public Account(long number, int amount) throws NegativeNumbersException {
        if (amount < 0) {
            throw new NegativeNumbersException("You can't create account with negative balance.");
        }
        this.number = number;
        this.amount = amount;
    }

    public long getNumber() {
        return number;
    }

    public int getAmount() {
        return amount;
    }

    public void withdraw(int sum) throws InsufficientFundsException, NegativeAmountException {
        if (sum > this.amount) {
            throw new InsufficientFundsException();
        }
        if (sum < 0) {
            throw new NegativeAmountException("You can't withdraw negative sum.");
        }
        this.amount -= sum;
    }

    public void deposit(int sum) throws NegativeAmountException {
        if (sum < 0) {
            throw new NegativeAmountException("You can't add negative sum to account.");
        }
        this.amount += sum;
    }

    @Override
    public String toString() {
        return String.format("%d - %d", number, amount);
    }
}
