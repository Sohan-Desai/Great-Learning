package try_catch;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100/0;
			System.out.println(a);
		} catch(ArithmeticException ae) {
			//throw new ArithmeticException("my custom message! " +ae);
			throw new MyException("My custom exception ");
		}
		
	}

}
