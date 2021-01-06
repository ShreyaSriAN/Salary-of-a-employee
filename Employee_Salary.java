package prog1;
import java.util.*;
public class Employee_Salary
{
	public static void main(String args[])
	{
		String name,id;
		double bSalary,DA,HRA,PF,IT,gross_income,net_income,deductions;
		double CCA=250,PT=100;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		name=sc.nextLine();
		System.out.println("Enter employee id");
		id=sc.nextLine();
		System.out.println("Enter employee basic salary");
		bSalary=sc.nextDouble();
		
		DA= (0.4)*bSalary;
		HRA=(0.2)*bSalary;
		PF=(0.1)*bSalary;
		gross_income=bSalary+DA+HRA+CCA;
		IT=(0.1)*gross_income;
		deductions=PF+PT+IT;
		net_income=gross_income-deductions;
		
		System.out.println("The Gross Income of the employee "+name+" with ID "+id+" is "+gross_income);
		System.out.println("The Net Income of the Employee "+name+" with ID "+id+" is "+net_income);
		sc.close();
		
	}
}
