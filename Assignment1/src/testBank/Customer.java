package testBank;
import java.util.ArrayList;

public class Customer
{
    //creates all variables for the customer object
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<SavingAccount> savingsAccounts = new ArrayList<>();
    private ArrayList<CheckingAccount> checkingAccounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String pin) //creates the customer object
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getFirstName()
    {
        return firstName;
    } //returns first name

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    } //sets the first name

    public String getLastName()
    {
        return lastName;
    } //returns the last name

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    } //sets the last name

    public String getPin()
    {
        return pin;
    } //returns the pin

    public void setPin(String pin)
    {
        this.pin = pin;
    } //sets the pin

    public void displaySavingsAccount() //display all info about the savings account of the customer
    {
        // print all checking accounts info
        for (SavingAccount account : savingsAccounts)
        {
            System.out.println(account.getAccountInfo());
        }
    }

    public SavingAccount findSavingsAccount(int accountNumber) //returns an existing savings account
    {
        SavingAccount found = null;
        for (SavingAccount account : savingsAccounts)
        {
            if (account.getAccountNumber() == (accountNumber))
            {
                found = account;
            }
        }
        return found;
    }

    public void addSavingsAccount(SavingAccount savingsAccount)
    {
        this.savingsAccounts.add(savingsAccount);
    }
    //creates a new savings account

    public void displayCheckingAccount()//displays info for checking account
    {
        // print all checking accounts info
        for (CheckingAccount account : checkingAccounts)
        {
            System.out.println(account.getAccountInfo());
        }
    }

    public CheckingAccount findCheckingAccount(int accountNumber) //returns an existing checkings account
    {
        CheckingAccount found = null;
        for (CheckingAccount account : checkingAccounts)
        {
            if (account.getAccountNumber() == (accountNumber))
            {
                found = account;
            }
        }
        return found;
    }

    public void addCheckingAccount(CheckingAccount checkingAccount)
    {
        this.checkingAccounts.add(checkingAccount);
    }
//creates a new chacking acct
    public String customerInfo() //returns customer info
    {
        return String.format("First Name: %s%n"
                        + "Last Name: %s%n"
                        + "PIN: %s%n",
                this.firstName, this.lastName, this.pin);
    }
}
