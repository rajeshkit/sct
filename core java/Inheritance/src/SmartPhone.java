
public class SmartPhone extends Phone {
	
	public SmartPhone() {
		
		super(10);
		
		System.out.println("Smartphone class non-arg constructor");
	}
	public SmartPhone(int a) {
	
		System.out.println("Smartphone class non-arg constructor");
	}
	public void gallery() {
		
	}
	public static void main(String[] args) {
		SmartPhone sm=new SmartPhone();
		
	}
}
