import java.util.Random;
import java.util.Scanner;
public class Animal {
	
	public static void main(String[] args) {
		System.out.println("Random number generator\n" + "Enter the number of elements :");
		Scanner in = new Scanner(System.in);
		Random  rd = new Random();
		int limit = in.nextInt();
		int[] Seq = new int [limit];
		int i;
		for(i=0; i<limit; i++) {
			Seq[i] = rd.nextInt(5000);
		}
		System.out.println("Array has been generated :");
		for(i=0; i<limit; i++) {
			System.out.print(" " +Seq[i]);
		}
	}
}

