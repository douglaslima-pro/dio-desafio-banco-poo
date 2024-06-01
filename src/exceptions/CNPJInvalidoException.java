package exceptions;

public class CNPJInvalidoException extends Exception {

	public CNPJInvalidoException() {

	}

	public CNPJInvalidoException(String errorMessage) {
		super(errorMessage);
	}

	public CNPJInvalidoException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}

	public CNPJInvalidoException(Throwable cause) {
		super(cause);
	}

}