
import java.util.Scanner;

public class JohnsonProblem3b {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt user to enter the employee Name 
		System.out.println("Please enter Employee's name: ");
		String employeeName = input.next();
		
		// Prompt user to enter the number of hours worked / week
		System.out.println(" Please enter number of hours worked / week: ");
		int hoursWorked = input.nextInt();
		
		// Prompt user to enter hourly pay rate 
		System.out.println("Please enter the hourly Pay Rate: ");
		double payRate = input.nextDouble(); 
		
		// Prompt user to enter federal tax rate 
		System.out.println("Please enter federal tax rate: ");
		double fedTax = input.nextDouble(); 
		
		// Prompt user to enter state tax rate
		System.out.println("Please enter state tax rate: ");
		double stateTax = input.nextDouble(); 
		
		//Employee Name, Hours Worked, and Pay Rate Print Line 
		System.out.println("Employee Name: ");
		String EmpName = input.next();
		System.out.println("Hours Worked:" + hoursWorked);
		System.out.println("Pay Rate:" + payRate);
		
		//Pay Rate * Hours Worked
		double grossPay;
		grossPay = payRate * hoursWorked;
		System.out.println("Gross Pay:" + grossPay);
		
		//Gross Pay * Federal Tax Rate
		double deductions;
		deductions = grossPay * fedTax;
		
		//Deductions Print Statement 
		System.out.println("\tDeductions:");
		System.out.println("\t\tFederal Witholding %: $" + deductions);
		
		//Gross Pay * State Tax
		double statTax;
		statTax = grossPay * stateTax;
		System.out.println("\t\tState Witholding %: $" + statTax);
		
		//Deductions + State Tax
		double totalDeduction;
		totalDeduction = deductions + statTax;
		System.out.println("\t\tTotal Deduction: $" + totalDeduction);
		
		//Net Pay: Gross Pay - Total Deduction 
		double netPay;
		netPay = grossPay - totalDeduction;
		
		// Display Final Result (Net Pay)
	System.out.println("Net Pay: " + netPay);
		
		
		
		
		
		
				

	}

}
