/**
 * An object that provides the functionalities and the data
 * of an employee
 * @author Trevor Douglas/Jonathan Vargas
 * @version 1.1.0 Oct.31, 2019       
 *
 */
public class Employee
{
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNum;
    private String hireDate;
    private String salary;

    /**
     * the default constructor sets the employee's info blank
     */
    public Employee()
    {
    	this.firstName = "";
    	this.lastName = "";
    	this.address = "";
    	this.phoneNum = "";
    	this.hireDate = "";
    	this.salary = "";
    }
    
   
    /**
     * Sets the current instance of Employee with the information given   
     * @param firstName: first name of employee
     * @param lastName: last name of employee
     * @param address: address of employee
     * @param phoneNum: phone number of the employee
     * @param hireDate: the hire date of the employee 
     * @param salary: the salary of the employee
     */
    public void setEmployee(String firstName, String lastName, String address,
    String phoneNum,String hireDate, String salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.hireDate = hireDate;
        this.salary = salary;
    }
    /**
     * Returns the firstName of the employee
     * @return firstName: the first name of the employee
     */
    public String getfirstName()
    {
        return this.firstName;
    } 
    /**
     * Sets the current instance of the employee's first name 
     * @param firstName: the first name of the employee
     */
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    /**
     * returns the employees lastName
     * @return lastName: The last name of the employee
     */
    public String getlastName()
    {
        return this.lastName;
    }
    
    /**
     * Returns the address of the employee
     * @return address: the address of the employee
     */
    public String getaddress()
    {
        return this.address;
    }

    /**
     * returns the phone number of the employee
     * @return phoneNum: the phone number of the employee
     */
    public String getPhoneNum()
    {
        return this.phoneNum;
    }

    /**
     * returns the hire date of the employee
     * @return hireDate: the hire date of the employee
     */
    public String getHireDate()
    {
        return this.hireDate;
    }

    /**
     * Returns the salary of the employee
     * @return salary: the salary of the employee
     */
    public String getSalary()
    {
        return this.salary;
    }

    /**
     * Prints the information of the employee
     */
    public void printEmployeeData()
    {
        System.out.format(
            "Name: %s %s| addr: %s| Phone Number: %s|" +
            " Hire Date: %s| salary: %s \n",
            this.firstName,
            this.lastName,
            this.address,
            this.phoneNum,
            this.hireDate,
            this.salary);
    }
}
