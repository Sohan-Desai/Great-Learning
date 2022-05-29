import java.util.Scanner;
public class Demo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to store :");
		int limit = sc.nextInt();
		int[] Array = new int [limit];
		int gap,i,j,temp;
		System.out.println("Enter the elements :");
		for (i=0; i<limit; i++)
			Array[i]=sc.nextInt();
		
		for(gap=limit/2; gap>0; gap/=2) {
			for(i=gap; i<limit; i++) {
				for(j=i-gap; j>=0&&Array[j]>Array[j+gap]; j-=gap) {
					temp = Array[j];
					Array[j] = Array[j+gap];
					Array[j+gap] = temp;
				}
			}
		}
		sc.close();
		System.out.println("Sorted array,");
		for(j=0; j<limit; j++)
			System.out.print("\t" +Array[j]);
		System.out.println();
	}
}