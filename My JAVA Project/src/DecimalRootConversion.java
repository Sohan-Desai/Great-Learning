import java.util.Scanner;
import java.util.*;
public class DecimalRootConversion {
	String digit="";
	char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int[] arr = new int[16];
	
	public void convert1(int number, int root) {
		int i=0, j=1;
		while(number>0) {
			arr[i]=number%root;
			number/=root;
			i++;
		}

		System.out.print("\nResult = ");
		if(i%4!=0)
			for(j=0; j<4-(i%4); j++)
				System.out.print("0");
		for(root=0 ; root<i; root++) {
			if(j%4==0)
				System.out.print(" ");
			System.out.print(arr[i]);
			j++;
		}
	}
	
	public void convert2(int num,int base) {
		int j=0, i=0;
		while(num>0) {
			j=num%base;
			digit+=hexChars[j];
			num/=base;
			i++;
		}

		System.out.print("\nResult = ");
		if(i%4!=0)
			for(j=0; j<4-(i%4); j++)
				System.out.print("0");
		for(base=0 ; base<i; base++) {
			if(j%4==0)
				System.out.print(" ");
			System.out.print(base);
			j++;
		}
	}
	
	public static void main(String[] args) {
		
		DecimalRootConversion obj= new DecimalRootConversion();
		int num, base=0, i=0, j=1;
		System.out.println("Enter the decimal number : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println("Choose from below options :\n" +"Enter 1 for Binary conversion\n" +"Enter 2 for Octal conversion\n" +"Enter 3 for Hexadecimal conversion\n");
		switch (scan.nextInt()) {
		case 1: base=2;
				System.out.println("You've chosen Binary conversion");
				obj.convert1(num, base);
				break;
		case 2: base=8;
				System.out.println("You've chosen Octal conversion");
				obj.convert1(num, base);
				break;
		case 3: base=16;
				System.out.println("You've chosen Hexadecimal conversion");
				obj.convert2(num, base);
				break;
		default: System.out.println("Invalid input!");
		}
		
		System.out.println("\nThankyou!");
	}
}