//import java.util.Scanner;
public class Demo extends Exec {
	
	public void car() {
		System.out.println("I am class Demo");
	}
    public static void main(String args[]){
    	Exec obj1 = new Exec();
    	Exec obj2 = new Demo();
    	Demo obj3 = new Demo();
    	obj1.car();
    	obj2.car();
    	obj3.car();
    }
}