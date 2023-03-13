
public class Customer {
	String name;// instance member variable 
	int accountNumber;// instance member variable 
	int age;// instance variable 
	int aadharNumber;//instance variable
	static String bankName="ICICI"; // static member variable 
	
	public void transaction() { //instance member function
		System.out.println(name);
	}
	
	public static void editProfile() {//static member function
		int a; // local varibale lifetime, visibility
	
	}
	public static void main(String[] args) {//static member function
		Customer c1=new Customer();//20202020
		c1.name="Rajesh";
		System.out.println(c1.name);
		c1.transaction();
	
		Customer c2=new Customer();//30303030
		
		c2.name="TCS";
		c2.transaction();
		Customer.editProfile();
		Customer.bankName="SBI";
		System.out.println(Customer.bankName);
	}
}
