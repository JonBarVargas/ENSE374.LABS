
/**
 * savingsAccount 
 * 
 * An object that contains the minimum functionalities of
 * of a bank account. This is a parent class to the different
 * types of accounts at the hypothetical bank of Jonathan Vargas
 * 
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Oct 18, 2019
 */
public class savingsAccount extends bankAccount {
	
/**
 * @param openDeposit the initial amount of money deposited in the bank account
 * 
 * creates an instance of a savingsAccount
 * makes sure that the opening deposit is greater or equal to 
 * the minimal opening deposit.
 */
	public savingsAccount(double openDeposit)
	{
		minOpenDeposit = 10.00;
		minBalance = 1.00;
		
		if (openDeposit < minOpenDeposit)
		{
			System.out.println("Insufficient funds to open a savings account. The minimum opening deposit is $10.00");
			balanceTotal = -1.00;
		}
		else
		{
			balanceTotal = openDeposit;
		}
	}
	
/**
 * compoundBiWeekly
 * 
 * This method takes the user's total balance in their account and calculates the money
 * in the account after a year of biweekly interest.
 * 
 * @param annInterest 	the annual interest that will be used to calculate the biweekly 
 * 						interest 
 * @param monthlyDeposit The set amount of money automatically deposited by the user every month
 * @return estTotal		The estimated amount of money in the account from compound interest
 */
	public double compoundBiWeekly(double annInterest, double monthlyDeposit)
	{
		double estTotal = balanceTotal;
		interestRate = (annInterest/ 100.0)/26;
		for(int i=1; i<=26; i++)
		{
			//this if statement auto deposits money at the 
			//beginning of each month
			if (i%2 == 1 && i != 26)
			{
				estTotal += monthlyDeposit;
			}
			estTotal *=(1+interestRate);
		}
		return estTotal;
	}
	
	/**
	 * compoundMonthly
	 * 
	 * This method takes the user's total balance in their account and calculates the money
	 * in the account after a year of monthly interest.
	 * 
	 * @param annInterest	the annual interest that will be used to calculate the biweekly 
	 * 						interest
	 * @param monthlyDeposit  The set amount of money automatically deposited by the user every month
	 * @return  estTotal	The estimated amount of money in the account from compound interest
	 */
	public double compoundMonthly(double annInterest, double monthlyDeposit)
	{
		double estTotal = balanceTotal;
		interestRate = (annInterest/ 100.0)/12;
		for(int i=1; i<=12; i++)
		{
			estTotal += monthlyDeposit;
			estTotal *= (1 + interestRate);
		}
		return estTotal;
	}
	
	
}
