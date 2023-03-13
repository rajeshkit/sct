package polymorphism;

public abstract class CCApproval {
	final int ccAmount = 57466;

	public String approveCard(int creditScore) {// overridded
		if (creditScore > 750) {
			return "Approved";
		}
		return "Rejected";
	}

	public abstract void display();

}
