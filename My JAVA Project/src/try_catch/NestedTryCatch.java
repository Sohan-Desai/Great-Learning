package try_catch;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				try {
					int[] arr = {1, 2, 3, 4, 5};
					System.out.println(arr[10]);
				} catch(NullPointerException e) {
					System.out.println("NullPointerException in block 3: " +e);
					//throw e;
				}
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException in block 2: " +e);
				//throw e;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException in block 1: " +e);
		}
	}

}
