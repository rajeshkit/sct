
public class Phone {
	int cost;
	String model;
	Phone(){
		this(45);
		System.out.println("Phone class constructor");
	}
	Phone(int a){
		this(45,56);
		System.out.println("Phone class one arg constructor");
	}
	Phone(int a,int b){
		System.out.println("Phone class two arg constructor");
	}
	public void makeCall() {
		System.out.println("Making Call");
	}
	
	public void sendSms() {
		System.out.println("Sending SMS");
	}
	public static void main(String[] args) {
		Phone p=new Phone();
	}

}
