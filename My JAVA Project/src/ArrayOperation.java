import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][] Arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		int[][] Brr = {{20,19,18,17},{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
		int[][] Crr = {{21,22,23},{24,25,26},{27,28,29},{30,31,32}};
		int[][] addResult = new int [Brr.length][Brr[0].length];
		int[][] multResult = new int [Arr.length][Crr[0].length];
		int i,j,k;
		System.out.println("Enter 1 for addition\n" +"Enter 2 for multiplication");
		int choice = scn.nextInt();
		
		switch (choice) {
		case 1:
			if((Arr.length == Brr.length)&&(Arr[0].length == Brr[0].length))
				for(i=0; i<Arr.length; i++) {
					for(j=0; j<Arr[0].length; j++) {
						addResult[i][j] = Arr[i][j] + Brr[i][j];
					}
				}
			System.out.println("You have chosen to ADD matrices\n" + "Result is as follows,");
			for(i=0; i<Arr.length; i++) {
				for(j=0; j<Arr[0].length; j++) {
					System.out.print("\t" +addResult[i][j]);
				}
				System.out.println();
			}
			break;
		case 2:
			if(Arr.length == Crr[0].length) {
				for(i=0; i<Crr.length; i++) {
					for(k=0; k<Arr[0].length; k++) {
						multResult[i][k] = 0;
						for(j=0; j<Arr.length; j++) {
							multResult[i][k] += Arr[i][j] * Crr[j][k];
						}
					}
				}
				System.out.println("You have chosen to MULTIPLY matrices\n" + "Result is as follows,");
				for(i=0; i<multResult.length; i++) {
					for(j=0; j<multResult.length; j++) {
						System.out.print("\t" +multResult[i][j]);
					}
					System.out.println();
				}
			}
			else if(Crr.length == Arr[0].length) {
				for(i=0; i<Arr.length; i++) {
					for(k=0; k<Crr[0].length; k++) {
						multResult[i][k] = 0;
						for(j=0; j<Crr.length; j++) {
							multResult[i][k] += Arr[i][j] * Crr[j][k];
						}
					}
				}
				System.out.println("You have chosen to MULTIPLY matrices\n" + "Result is as follows,");
				for(i=0; i<multResult.length; i++) {
					for(j=0; j<multResult[0].length; j++) {
						System.out.print("\t" +multResult[i][j]);
					}
					System.out.println();
				}
			}
			break;
		default:
			System.out.println("\nInvalid input!");
			break;
		}
		System.out.println("Thank You!");
	}
}
