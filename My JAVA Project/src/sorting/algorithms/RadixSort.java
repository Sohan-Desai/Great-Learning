package sorting.algorithms;

public class RadixSort {
	
	static int findLargest(int[] arr, int size) {
		int max = arr[0];
		for(int i=0; i<=size; i++)
			if(max<arr[i])
				max=arr[i];
		return max;
	}
	
	static void sortArray(int[] arr, int size, int exp) {
		int[] result = new int[size+1];
		int[] count = new int[10];
		for (int i=0; i<=size; i++)
			count[i]=0;
		
		for (int i=0; i<=size; i++)
			count[(arr[i]/exp)%10]++;
		
		for (int i=1; i<=9; i++)
			count[i]+=count[i-1];
		
		for (int i=size; i>=0; i--) {
			result[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		
		for(int i=0; i<=size; i++)
			arr[i]=result[i];
	}
	
	static void implementationOfRadixSort(int[] arr, int size) {
		int max=findLargest(arr, size);
		int exp=1;
		while((max/exp)>0) {
			sortArray(arr, size, exp);
			exp*=10;
		}
	}
	
	static void printArray(int[] arr, int size) {
		for (int i=0; i<=size; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {21, 549, 63, 12, 778, 307, 911, 777};
		int n = (array.length -1);
		System.out.println("Array before sorting:");
		printArray(array, n);
		implementationOfRadixSort(array, n);
		System.out.println("Array after sorting:");
		printArray(array, n);
	}

}
