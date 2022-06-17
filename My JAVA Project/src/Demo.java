import java.util.*;
public class Demo implements Comparator {
	public int compare(Object current, Object present) {
		String curr = (String) current;
		String pres = present.toString();
		System.out.println(" ");
		return pres.compareTo(curr);
	}
}
