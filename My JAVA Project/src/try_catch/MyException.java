package try_catch;

public class MyException extends RuntimeException {
	//default constructor
	MyException(){
		
	}
	//parameterized constructor
	MyException(String str){
		super(str);
	}
}
