package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Player {
	void display() throws FileNotFoundException  {
		System.out.println("display1");
		sum();
		System.out.println("display2");
	}
	void sum() throws FileNotFoundException  {//instance method
		System.out.println("sum1");
		//int k=10/0; // throw new ArithmeticException();
		FileReader fr=new FileReader("");
		System.out.println("sum2");
	}
	
	public static void main(String[] args) throws FileNotFoundException{//static method
		
		System.out.println("Player Details1");
		Player p=new Player();
		int k=10/0;
		p.display();
		System.out.println("Player Details n");
		
	}
}
