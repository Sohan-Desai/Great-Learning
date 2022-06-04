import java.util.Scanner;

public class ArrayTest {
	
	int [] Arr;
	int size, capacity;
	
	ArrayTest (int capacity){
		this.capacity = capacity;
		Arr = new int [capacity];
		size = 0;
	}
	
	void InsertElement() {
		Scanner in = new Scanner(System.in);
		int last, i;
		System.out.println("How many Elements to enter?");
		last = in.nextInt() +size;
		System.out.println("Array is ready!\n" +"Enter " +(last-size) +" elements :");
		for (i=size; i<last; i++) {
			if (size==capacity)
				ExpandArray();
			Arr [i] = in.nextInt();
			size++;
		}
	}
	
	void ExpandArray() {
		int[] temp = new int[2*capacity];
		for (int i=0; i<size; i++)
			temp [i] = Arr [i];
		Arr = temp;
		capacity*=2;
	}
	
	int DeleteElement() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the index of element to be deleted: ");
		int index = in.nextInt();
		if (index>=size)
			return -1;
		int element = Arr[index];
		while (index<size-1) {
			Arr[index] = Arr[index+1];
			index++;
		}
		Arr[index]=0;
		size--;
		return element;
	}
	
	void Display() {
		System.out.println("\nArray as per size,");
		for (int i=0; i<size; i++)
			System.out.print("\t" +Arr[i]);
		System.out.println("\nArray as per capacity,");
		for (int i=0; i<capacity; i++)
			System.out.print("\t" +Arr[i]);
		System.out.println();
	}
	
	public static void main (String[] args) {
		ArrayTest ob = new ArrayTest(4);
		ob.InsertElement();
		ob.Display();
		System.out.println("\nDeleted Element = " +ob.DeleteElement());
		ob.Display();
		ob.InsertElement();
		ob.Display();
	}
}
