import java.util.Scanner;

public class Exec {
	public int findArea(int length, int width) {
		int area = length*width;
		return area;
	}
	
	public void findArea(double length, double width, double height) {
		System.out.println("Total surface area of the given cuboid is " +(2*(length*width + length*height + width*height)));
	}
	
	void car() {
		System.out.println("I am class Exec");
	}
	
	public static void main(String[] args) {
		Exec polymorphism = new Exec();
		int area = polymorphism.findArea(5,9);
		System.out.println("Area of rectangle is " +area);
		polymorphism.findArea(3.5,1.27,6.84);
	}
}
