
public class Demo {
	
	static int i=0;
	static int count=15;
		
	public static void CheckStatic() {
		System.out.println(count +" + " +i +" = 15");	
	}
		
	public static void main(String[] args) {
		while (count>0) {
			CheckStatic();
			i++; count--;
		}
		
	}

}
