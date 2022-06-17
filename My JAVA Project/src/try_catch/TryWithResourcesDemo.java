package try_catch;
import java.io.IOException;
import java.io.FileOutputStream;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C://Users//sohan//git//Great-Learning//My JAVA Project//src//try_catch//try_with_demo.txt";
		
		try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
			
			String content = "Welcome to try-with-resources demo!";
			fileOutputStream.write(content.getBytes());
			
			System.out.println("Content written to file successfully");
		} catch(IOException exception) {
			System.out.println("exception occured: " +exception);
		}
	}
}
