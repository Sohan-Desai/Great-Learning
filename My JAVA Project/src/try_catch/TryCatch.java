package try_catch;

import java.util.ArrayList;
import java.util.List;
public class TryCatch {
	
	public void writeList() {
		try {
			List<Integer> list = new ArrayList<>(10);
			list.add(10);
			list.add(15);
			System.out.println("Entering " +"try statement");
			Integer a = list.get(1);
			System.out.println("Accessing the first element : " + a);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught, IndexOutOfBoundsException: " + e.getMessage());
		} finally {
			System.out.println("This will always be executed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatch demo = new TryCatch();
		demo.writeList();
	}

}
