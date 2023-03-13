package exception;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Ums {
	void display() throws UserIdNotFoundException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the User ID");
		int id=s.nextInt();
		if(id<0) {
			throw new UserIdNotFoundException("id cannot be negative");
		}
		System.out.println("User ID Found Successfully");
	}
	public static void main(String[] args) throws UserIdNotFoundException {
		Ums u=new Ums();
			try(Scanner s=new Scanner(System.in);
				Connection	con=DriverManager.getConnection("", "", "");
				FileReader fr=new FileReader("")) {
				
		
				
				u.display();//on this line exception happening
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			
				
				
			}
		
	}
}
