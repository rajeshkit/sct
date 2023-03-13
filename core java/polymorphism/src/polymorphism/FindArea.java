package polymorphism;

import java.util.Scanner;

public class FindArea {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float side = s.nextFloat();
		CalculateArea ca=new CalculateArea();
		ca.findArea(side);
		
	}
}
