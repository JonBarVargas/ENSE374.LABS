/**
 * An application that adds employees into a database 
 * and sorts out the employees
 * @author Trevor Douglas/Jonathan Vargas
 * @version 1.1.0 Oct.31, 2019                
 */
import java.util.Scanner;

public class EmployeeApplication{

	static final int DATABASE_SIZE = 3;
	public static void main(String[] args)
    {
		
    	Employee[] employeeDatabase = new Employee[DATABASE_SIZE];
		EmployeeApplication employeeApplication = new EmployeeApplication();
		employeeApplication.addEmployees(employeeDatabase);
		employeeApplication.displayEmployeeData(employeeDatabase);
		
		System.out.println();
		System.out.println("This the employee list in order:");
		
		Employee[] sorted = new Employee[DATABASE_SIZE];
		sorted = employeeApplication.sortByName(employeeDatabase,DATABASE_SIZE);
		employeeApplication.displayEmployeeData(sorted);

    }

    /**
     * sorts the employees alphabetically by last name
     * and returns the sorted array
     * @param database: the employee array
     * @param databaseSize: the size of the employee array
     * @return sorted: the sorted employee array
     */
	public Employee[] sortByName(Employee[] database, int databaseSize)
    {
        Employee[] sorted = database;
        for(int i=1; i<(databaseSize); i++)
        {
            for(int j=0; j<(databaseSize-i); j++)
            {
                if (sorted[j].getlastName().compareTo(sorted[j+1].getlastName())>0)
                {
                    Employee temp = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

	/**
	 * adds the employee information into the database
	 * @param employeeDatabase: array that contains the data of employees
	 */
	public void addEmployees(Employee[] employeeDatabase)
	{
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < DATABASE_SIZE; ++i)
		{
			employeeDatabase[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter an Employee's addressess: ");
			String address = input.nextLine();
			System.out.print("Enter an Employee's Phone Number: ");
			String phoneNumber = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String salary = input.nextLine();

			employeeDatabase[i].setEmployee(firstName, lastName, address,  phoneNumber, hireDate,  salary);
		}
	}


	/**
	 * Displays each employee in the database
	 * @param employeeDatabase: the employee array
	 */
	public void displayEmployeeData(Employee[] employeeDatabase)
	{
		for (int i = 0; i < DATABASE_SIZE; ++i)
		{

			employeeDatabase[i].printEmployeeData();

		}
	}
}
