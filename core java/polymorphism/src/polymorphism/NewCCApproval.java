package polymorphism;

public class NewCCApproval extends CCApproval{
	public void display() {
		
	}
	public String approveCard(int creditScore) {//overriding
		if(creditScore>750) {
			return "Approved";
		}
		return "Rejected";
	}
	public static void main(String[] args) {
		CCApproval cc=new NewCCApproval();
		cc.approveCard(34);
		cc.display();
	}
}
