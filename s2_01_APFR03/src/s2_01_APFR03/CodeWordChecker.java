package s2_01_APFR03;
/**
 * 
 * @author compsci
 *
 */


/**
 *   Point +1 --Declares Header
 */
public class CodeWordChecker implements StringChecker{
	
	/**
	 *   Point +1 --Declares all private instance variables
	 */
	
	private int minLength;
	private int maxLength;
	private String notAllowed;
	
	public static void main(String[] args) {
		int minLen = 5;
		int maxLen = 8;
		String symbol = "$";
	
	}
	
	/**
	 * Point +1 --Parameters to initialize instance variables in 3-parameter constructor
	 * @param minLen smallest allowed length of string
	 * @param maxLen largest allowed length of string
	 * @param symbol symbol that is not allowed to appear in the string
	 * Point +1 --Declare header public CodeWordChecker(int minLen, int maxLen, String symbol) - public CodeWordChecker(String symbol)
	 * 
	 */

	public CodeWordChecker(int minLen, int maxLen, String symbol)
	{
		maxLength = maxLen;
		minLength = minLen;
		notAllowed = symbol;
		
	}
	
	
	/**
	 *   Point +1 --Parameters to initialize instance variables in 1-parameter constructor 
	 *   @param symbol symbol that is not allowed to appear in string
	 */
	public CodeWordChecker(String symbol)
	{
		minLength = 6;
		maxLength = 20;
		notAllowed = symbol;
	}	
	
	/**
	 *  Point 1 --Declares header 
	 *  @return boolean value true or false if the criteria are meet or not
	 */
	
	public boolean isValid(String str)
	{
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1;
 	}
	
}
