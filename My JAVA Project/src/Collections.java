import java.util.*;
//import java.io.Serializable;
//import java.lang.Cloneable;

public class Collections {
	public static void main(String[] args) {
		TreeSet <String> t1 = new TreeSet <String> (new Demo());
		t1.add("Roja");
		t1.add("Shobha Rani");
		t1.add("Raja Kumari");
		t1.add("Ganga Bhavani");
		t1.add("Ramulamma");
		System.out.println("Set = " +t1);
			
	}
}
