
public class Animal {

		static int count;
		
		String name;
		String color;
		
		void setName(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
		
		void updateCount() {
			count++;
			System.out.println(count);
		}

}
