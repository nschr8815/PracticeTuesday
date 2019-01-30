package s2_01_APFR03;

public class CodeWordChecker implements StringChecker{
	private int minLength;
	private int maxLength;
	private String notAllowed;


	public static void main(String[] args) {
		int minLen = 5;
		int maxLen = 8;
		String symbol = "$";
		CodeWordChecker(minLen, maxLen, symbol);
	}
	
	
	public CodeWordChecker(int minLen, int maxLen, String symbol)
	{
		maxLength = maxLen;
		minLength = minLen;
		notAllowed = symbol;
	}
	
	public CodeWordChecker(String symbol)
	{
		minLength = 6;
		maxLength = 20;
		notAllowed = symbol;
	}
	
	public boolean isValid(String str)
	{
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1;
 	}

}
