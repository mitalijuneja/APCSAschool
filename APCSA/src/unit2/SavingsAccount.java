package unit2;

public class SavingsAccount
{
    double interest;
	private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public SavingsAccount()
    {
        balance = 0;
        interest = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public SavingsAccount(double initialBalance, double initialInterest)
    {
        balance = initialBalance;
        interest = initialInterest;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    public double addInterest()
    {
    	balance = balance + balance*(interest/100);
    	return balance;
    }
}