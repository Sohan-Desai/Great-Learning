package sorting.algorithms;

public class QuickSort {
	
	static void implementationOfQuickSort(int[] arr, int start, int end) {
		if(start<end) {	
			int index = partition(arr, start, end);
			implementationOfQuickSort(arr, start, index-1);
			implementationOfQuickSort(arr, index+1, end);
		}
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i=start-1;
		for(int j=start; j<end; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, ++i, end);
		return i;
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
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
		implementationOfQuickSort(array, 0, n);
		System.out.println("Array after sorting:");
		printArray(array, n);
	}

}
