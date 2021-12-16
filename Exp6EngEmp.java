package cslab;
import java.util.Scanner;
class employee
{
	int  salary,DA,HRA;
    float GrossSalary;
    void display() 
	{
		System.out.println("Name of class is EMPLOYEE ");
	}
	void calcsalary()
	{
		GrossSalary = salary + (salary*DA/100 )+ (salary*HRA/100);
		System.out.println("Gross salary of the EMPLOYEE is "+GrossSalary);
	}
}
class Engineer extends employee
{
	void display()
	{
		super.display();
	}
	void calcsalary()
	{
		super.calcsalary();
		float grossSalary1=GrossSalary*2;
		System.out.println("Name of class is ENGINEER :");
		System.out.println("The GrossSalary of ENGINEER is"+grossSalary1);
        
	}
	
}
public class Exp6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Engineer e=new Engineer();
		System.out.println("Enter the Basic Salary of the Employee:");
		e.salary=sc.nextInt();
		System.out.println("Enter the DA of the Employee:");
		e.DA=sc.nextInt();
		System.out.println("Enter the HRA of the Employee:");
		e.HRA=sc.nextInt();
		e.display();
		e.calcsalary();
		sc.close();
		
	}
	
}
