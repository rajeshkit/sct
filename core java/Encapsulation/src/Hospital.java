import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Person p=new Person();
		System.out.println("Enter the Person Name");
		p.setName(s.nextLine());
		System.out.println("Enter the email");
		p.setEmail(s.nextLine());
		s.nextLine();
		System.out.println("Enter the Phone");
		p.setPhone(s.nextInt());
		Insurance ins=new Insurance();
		ins.display(p);
	}
}
