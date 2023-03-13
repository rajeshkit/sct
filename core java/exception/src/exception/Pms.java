package exception;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pms implements Closeable{
	void display() throws FileNotFoundException {
		System.out.println("display1");
		sum();
		System.out.println("display2");
	}
	void sum() throws FileNotFoundException{//instance method
		System.out.println("sum1");
		Pms pms=new Pms();
	
		int k=10/0; // throw new ArithmeticException();
		FileReader fr=new FileReader("");
		System.out.println("sum2");
		fr.hashCode();
		
	}
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
