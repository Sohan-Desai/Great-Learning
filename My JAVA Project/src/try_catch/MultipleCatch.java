package try_catch;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int [10];
			arr[12]=20;
			String a = null;
			a.charAt(0);
			System.out.println(++arr[0]);
			System.out.println("Block ends here");
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) { //piped catch blocks
			System.out.println("common exception handling code: " +ae);
		} catch(Exception e) {
			System.out.println("Any other generic exception: " +e.getMessage());
		}
		System.out.println("I am out of try-catch blocks");
	}

}
