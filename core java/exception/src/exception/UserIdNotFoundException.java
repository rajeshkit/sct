package exception;

public class UserIdNotFoundException extends Exception {
	public UserIdNotFoundException() {
		super();
	}

	public UserIdNotFoundException(String msg) {
		super(msg);
	}
}
