
public class Bank {
	public static void main(String[] args) {
		Account acc=new Account();
		System.out.println(acc.getAccountBalance());
		acc.setAccountBalance(576);
		System.out.println(acc.getAccountBalance());
	}
}
