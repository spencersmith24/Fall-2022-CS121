package testBank;

public class SavingAccount extends Account{
    private String accountType = "Savings";

	public SavingAccount(double initialDeposit) //sets the acct balance to the initialDeposit
    {
        super();
        this.deposit(initialDeposit);
    }

    private String getAccountType()
    {
        return accountType;
    } //returns the type of account

    public String getAccountInfo() //returns acct info
    {
        return String.format("%nAccount Type: %s Account%n"
                        + "Account Number: %d%n"
                        + "Balance: %.2f%n"
                        + "Interest Rate: %.0f%%%n",
                this.getAccountType(), this.getAccountNumber(), this.getBalance(),
                this.getInterest());
    }

    public void checkInterest(double amount) //checks and sets the interest rate based on the acct balance
    {
        if (this.getBalance() + amount > 10000)
        {
            this.setInterest(0.07);
        }
        else
        {
            this.setInterest(0.04);
        }
    }
}

