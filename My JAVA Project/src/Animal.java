import java.lang.Math;
import java.util.Arrays;
public class Animal {
	int value = 15;
	int shiftDigits = 1;
	
	public int performLeftShift() {
		int[] Array = new int [12];
		int i = value, j=0;
		while(i>0) {
			Array[j] = i%2;
			i/=2;
			j++;
		}
		int result=0, count = j;
		for(i=0; i<shiftDigits; i++) {
			for(j=0; j<count; j++) {
				Array[j] = Array[j+1];
			}
		}
		for(i=count-1; i>=0; i--)
			result += Array[i]*(Math.pow(2,count-1-i));
		return result;
	}
	
	public void performRightShift(int val, int digitsToShift) {
		int[] Array = new int [12];
		int i=0, j;
		while(val>0) {
			Array[i] = val%2;
			val/=2;
			i++;
		}
		int result=0;
		for( ; digitsToShift>0; digitsToShift--) {
			for(j=i; j>0; j--) {
				Array[j] = Array[j-1];
			}
			Array[j]=0;
		}
		System.out.println("Shift performed succesfully!");
		for(j=i-1; j>=0; j--)
			result += Array[j]*(Math.pow(2,i-1-j));
		System.out.println("Result of right shift operation is " +result);
	}
	
	public static void main (String[] args) {
		Animal shift = new Animal();
		int result = shift.performLeftShift();
		shift.performRightShift(45,2);
		System.out.println("After " +shift.shiftDigits +" left shift operation " +shift.value +" turns into " +result);

	}
}
