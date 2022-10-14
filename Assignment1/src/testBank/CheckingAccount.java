package testBank;

public class CheckingAccount extends Account{
    private String accountType = "Checking";

	public CheckingAccount() //creates a checking acct and sets the balance to 0
    {
        super();
        this.setBalance(0);
    }

	public CheckingAccount(double initialDeposit) //creates checking acct and changes balance to initial deposit
    {
        super();
        this.deposit(initialDeposit);
    }

    private String getAccountType()
    {
        return accountType;
    } //returns the accountType

    public String getAccountInfo() //prints out all of the account's info
    {
        return String.format("%nAccount Type: %s Account%n"
                        + "Account Number: %d%n"
                        + "Balance: %.2f%n"
                        + "Interest Rate: %.0f%%%n",
                this.getAccountType(), this.getAccountNumber(), this.getBalance(),
                this.getInterest());
    }
}

