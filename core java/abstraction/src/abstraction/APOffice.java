package abstraction;

public class APOffice extends PassportHO {

	@Override
	public void approval() {
		System.out.println("approve through Pan card");
		
	}
	public static void main(String[] args) {
		APOffice ap=new APOffice();
		ap.applyOnline();
		ap.approval();
	}
	@Override
	public void dispatch() {
		System.out.println("courier");
		
	}

}
