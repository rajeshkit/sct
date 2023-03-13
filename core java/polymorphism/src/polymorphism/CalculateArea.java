package polymorphism;
public class CalculateArea {
	// findArea
	public void findArea(int side) {
		System.out.println("Square Area");
		System.out.println(side*side);
	}
	public void findArea(int length,int breadth) {
		System.out.println("Rectangle Area");
		System.out.println(length*breadth);
	}
	public void findArea(float radius) {
		System.out.println("Circle Area");
		System.out.println(3.14*radius*radius);
	}
	public void findArea(float base,int height) {
		System.out.println("Triangle Area");
		System.out.println(0.15*base*height);
	}
	public static void main(String[] args) {
		CalculateArea c=new CalculateArea();
		c.findArea(45);
		c.findArea(2.5f, 45);
		c.findArea(23, 25);
		c.findArea(4.5f);
	}
}
