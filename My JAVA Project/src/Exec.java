import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int num1=sc.nextInt();
		System.out.println("Enter the second value :");
		int num2=sc.nextInt();
		System.out.println("Kindly choose from following options :");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
		int choice=sc.nextInt();
		int result=0;
		sc.close();
		switch(choice)
		{
		case 1: result=num1+num2; System.out.println("Result = " +result); break;
		case 2: result=num1-num2; System.out.println("Result = " +result); break;
		case 3: result=num1*num2; System.out.println("Result = " +result); break;
		case 4: 
			if (num2==0)
				System.out.println("Cannot divide by 0");
			else 
				result=num1/num2; System.out.println("Result = " +result);
				break;
		default: System.out.println("Invalid choice!");
		}
	}
	
}