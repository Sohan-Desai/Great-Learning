package sorting.algorithms;

import java.util.ArrayList;

public class MergeSort {
	
	public int[] mergeSort(int[] array) {
		if(array.length<2)
			return array;
		else if(array.length==2)
			return (array[0]<array[1])?array:[array[1],array[0]];
		else {
			int mid = Math.floorDiv(array.length,2);
			return merge(mergeSort(getSlice(array,0,mid)),mergeSort(getSlice(array,mid+1,end)));
		}
	}
	
	public int[] merge(int[]Arr, int[]Brr) {
		ArrayList list = new ArrayList();
		int arrIndex=0;
		int brrIndex=0;
		
		while(arrIndex<Arr.length||brrIndex<Brr.length) {
			if(arrIndex<=Arr.length||Arr[arrIndex]<Brr[brrIndex])
				list.push(Brr[brrIndex++]);
		}
	}
	
	public static int[] getSlice(int[] arr, int start, int end) {
		
		// Get the slice of the Array
		int[] slice = new int[end - start];

		// Copy elements of arr to slice
		for (int i = 0; i < slice.length; i++) {
			slice[i] = arr[start + i];
		}

		// return the slice
		return slice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
