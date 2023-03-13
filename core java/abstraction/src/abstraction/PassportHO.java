package abstraction;

public abstract class PassportHO {
	protected int pincode=34444;
	private String officeName="Delhi";
	void applyOnline() {
		System.out.println("have to sign up login");
		System.out.println("Enter details");
		System.out.println("upload documents");
		System.out.println("payment");
		System.out.println("Schedule meet");
	}
	abstract void approval();
	abstract void dispatch();
}
