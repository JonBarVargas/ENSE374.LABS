/**
 * checkingAccount
 * 
 * A class that inherets the main funtionality of bankAccount
 * adds the constructors of a checking account
 * 
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Oct 18, 2019
 */
public class checkingAccount extends bankAccount {
	/**
	 * Default constructor. 
	 * 	sets the balance to 0 
	 */
	public checkingAccount()
	{
		balanceTotal = 0.00;
	}
	/**
	 * openingDeposit constructor.
	 * 	sets the balance total to openDeposit
	 * @param openDeposit 	the initial deposit a user makes when
	 * 						opening a checking account
	 */
	public checkingAccount(double openDeposit)
	{
		balanceTotal = openDeposit;
	}
}
