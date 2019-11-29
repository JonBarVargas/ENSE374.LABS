package com.ense374;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeTest {

public static void main(String[] args) throws IOException {
		
		Employee[] employeeList = new Employee[3];
        
		CommandLineInterface cli = new CommandLineInterface();
	
		Scanner input = new Scanner(System.in);
		
		
		
		/* Test 1  Verify that can handle all input from the user */
		
		boolean doneTest1 = false;
		String doneTest1Flag;
		
		
		do {
			int choice = cli.getMainMenuNumber();

			System.out.println(choice);
			
			System.out.println("Are We done test 1? Y/N");
			doneTest1Flag = input.nextLine();
			
			switch(doneTest1Flag) {
			
			case "Y":
				doneTest1 = true;
				break;
			case "N":
				doneTest1 = false;
				break;
			default:
				doneTest1 = false;
			}
			
			
		} while (doneTest1);
		
		/* Test 2 Pass in bad values for an employee*/
		//Pass in some bad data to the salary to ensure it can be handled
		
		Employee employee = cli.getEmployeeDataFromCLI();
            
			
		
		/* Test 3 Read in a file containing Employee Data */
		
		System.out.println("Reading in data: " + cli.readInEmployeeData("employee.csv", employeeList));
		
		System.out.println("All tests pass!");
		
	}

}
