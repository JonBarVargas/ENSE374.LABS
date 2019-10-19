/**
 * bankAccount 
 * 
 * An object that contains the minimum functionalities of
 * of a bank account. This is a parent class to the different
 * types of accounts at the hypothetical bank of Jonathan Vargas
 * 
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Oct 18, 2019
 */
public class bankAccount {
	protected double balanceTotal;
	protected double interestRate;
	protected double minOpenDeposit;
	protected double minBalance;
	
public double getBalanceTotal()
{
	return balanceTotal;
}

public double getInterestRate()
{
	return interestRate;
}

public void deposit(double amount)
{
	balanceTotal += amount;
}

public void withdraw(double amount)
{
	if (balanceTotal < amount)
	{
		System.out.println("You have insufficient funds for this transaction");
	}
	else
	{
		balanceTotal -= amount;
	}
}

}
