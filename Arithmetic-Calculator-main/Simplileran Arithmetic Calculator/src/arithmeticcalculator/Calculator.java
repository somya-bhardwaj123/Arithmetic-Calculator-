package arithmeticcalculator;

// Importing Scanner class for taking user input 
import java.util.*;

public class Calculator {
	
	// Variable deceleration
	static double num1, num2;
	private static String OP;
	
	// Creating method for reference
	Calculator(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	//creating scanner object
	Scanner sc = new Scanner(System.in);
	
	//created addition method
	double addition()
	{
		System.out.println("Enter first number for addition");
		num1=sc.nextDouble();
		System.out.println("Enter second number for addition");
		num2=sc.nextDouble();
		return num1+num2;
	}
	
	//created subtraction method
	double subtraction()
	{
		System.out.println("Enter first numbers for subtraction");
		num1=sc.nextDouble();
		System.out.println("Enter second numbers for subtraction");
		num2=sc.nextDouble();
		return num1-num2;
	}
	
	//created multiplication method
	double multiplication()
	{
		System.out.println("Enter first numbers for multiply");
		num1=sc.nextDouble();
		System.out.println("Enter second numbers for multiply");
		num2=sc.nextDouble();
		return num1*num2;
	}
	//creating division method
	double division()
	{
		System.out.println("Enter first numbers for divide");
		num1=sc.nextDouble();
		System.out.println("Enter second numbers for divide");
		num2=sc.nextDouble();
		if(num2==0) {
			System.out.println("Number can not be divide by zero");
		}
		return num1/num2;
	}
	
	//created main method  
	public static void main(String[] args)
	{
		//creating scanner object again
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operation that you want to perform by writing the correct form as mention below:- \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		OP = s.nextLine();
		// creating calculator object 
		Calculator obj = new Calculator(num1,num2);
		double n=0;
		// checking the operation that user give us as an input and call the method 
		switch(OP)
		{
		case "Addition":
			n=obj.addition();
			System.out.println("Answer = "+n);
			break;
		case "Subtraction":
			n=obj.subtraction();
			System.out.println("Answer = "+n);
			break;
		case "Multiplication":
			n=obj.multiplication();
			System.out.println("Answer = "+n);
			break;
		case "Division":
			n=obj.division();
			if(num2==0) 
			{
				break;
			}
			else 
			{
			System.out.println("Answer = "+n);
			}
			break;
		default:
			System.out.println("Wrong operations selected or Character don't match with the input");
		}
		
	}

}