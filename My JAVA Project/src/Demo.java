
public class Demo {
	
	public static void main(String[] args) {
		int i;
		for (i=1; i>0; i++)
		{
			if(i%2!=0)
				continue;
			else if(i>20)
				break;
			System.out.println(i);
		}
	}

}
