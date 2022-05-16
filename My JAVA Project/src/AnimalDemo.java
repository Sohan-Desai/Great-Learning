
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();
		cat.setName("Puffy");
		cat.color = "White";
		System.out.println(cat.getName());
		System.out.println("Colour : " +cat.color);
		cat.updateCount();
		
		Animal dog = new Animal();
		dog.setName("Pluto");
		dog.color = "Brown";
		System.out.println(dog.getName());
		System.out.println("Colour : " +dog.color);
		dog.updateCount();
	}

}
