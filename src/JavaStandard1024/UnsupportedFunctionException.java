package JavaStandard1024;

public class UnsupportedFunctionException extends RuntimeException{
	final private int ERR_CODE;
	
	public UnsupportedFunctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	public UnsupportedFunctionException(String msg) {
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage(); 
	}

}
