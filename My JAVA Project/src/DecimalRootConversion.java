import java.util.Scanner;
import java.util.*;
public class DecimalRootConversion {
	char[] digit = new char[16];
	char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int[] arr = new int[16];
	int sign;
	
	public void convertD_1(int number, int root) {
		int count=0;
		int mode=1;
		sign=(number>0)?1:-1;
		int num=Math.abs(number);
		while(num>0) {
			arr[count]=num%root;
			num/=root;
			count++;
		}
		
		System.out.print("Result = ");
		print(count, mode);
		
		if(root==2) {
			twosComplement(count);
		}
	}
	
	public void twosComplement(int count) {
		boolean state=false;
		int mode=2;
		if(sign>0) {
			System.out.print("\nTwo's Complement = ");
			print(count, mode);
		}
		else {
			int i=0;
			while(i<=count) {
				if(state==true) {
					if(arr[i]==0)
						arr[i]++;
					else
						arr[i]--;
				}
				else if(arr[i]==1) {
					state=true;
				}
				i++;
			}
			System.out.print("\nTwo's Complement = ");
			print(count, mode);
		}		
	}
	
	public void convertHex(int num,int base) {
		int count=0;
		int mode=1;
		while(num>0) {
			digit[count]=hexChars[num%base];
			num/=base;
			count++;
		}
		
		System.out.print("Result = ");
		print(count, mode);
	}
	
	public void print(int size, int mode) {
		int count=0,j=0;
		int pad=(sign<0&&mode>1)?1:0;
		if(sign<0&&mode==1)
			System.out.print("-");
		if(size%8!=0)
			for(j=0; j<8-(size%8); j++)
				System.out.print(pad);
		for(count=size-1 ; count>=0; count--) {
			if(j%8==0)
				System.out.print(" ");
			System.out.print(arr[count]);
			j++;
		}
	}
	
	public static void main(String[] args) {
		
		DecimalRootConversion obj= new DecimalRootConversion();
		int num, base=0;
		System.out.println("Welcome to Number Series converter\n" + "Here you can convert numbers from decimal series to\n" +"their equivalent in Binary, Octal or Hexadecimal series\n");
		System.out.println("Enter the decimal number : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println("-----------------------------------");
		System.out.println("Choose from below options :\n" +"Enter 1 for Binary conversion\n" +"Enter 2 for Octal conversion\n" +"Enter 3 for Hexadecimal conversion");
		System.out.println("-----------------------------------");
		switch (scan.nextInt()) {
		case 1: base=2;
				System.out.println("You've chosen Binary conversion");
				obj.convertD_1(num, base);
				break;
		case 2: base=8;
				System.out.println("You've chosen Octal conversion");
				obj.convertD_1(num, base);
				break;
		case 3: base=16;
				System.out.println("You've chosen Hexadecimal conversion");
				obj.convertHex(num, base);
				break;
		default: System.out.println("Invalid input!");
				break;
		}
		scan.close();
		System.out.println("\nThankyou!");
	}
	
}