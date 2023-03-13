import java.util.Scanner;

public class CreditCard {
	private int cardNumber;
	private String cardName;
	private String cardType;
	private String expiryMonthAndDate;
	public void createCard() {
	
		Scanner s=new Scanner(System.in);//has-a inheritance
		System.out.println("Enter the Card Number");
		cardNumber=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Card name ");
		cardName = s.nextLine();
		System.out.println("Enter the card type");
		cardType=s.nextLine();
		System.out.println("Enter card Expiry date");
		expiryMonthAndDate=s.nextLine();
	}
	public static void main(String[] args) {
		CreditCard cc=new CreditCard();
		cc.createCard();
	}
}
