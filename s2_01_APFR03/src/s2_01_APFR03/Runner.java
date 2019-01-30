package s2_01_APFR03;

public class Runner {

	public static void main(String[] args) {
		StringChecker sc1 = new CodeWordChecker(5,8, "$");

		
		System.out.println(sc1.isValid("happy"));
		System.out.println(sc1.isValid("happy$"));
		System.out.println(sc1.isValid("Code"));
		System.out.println(sc1.isValid("happyCode"));
	}
	

}
