import javax.swing.JOptionPane;

/**
 * Add two fractions, learn JavaDocs, Enter two fractions as Strings 
 * then use string methods to pull out num. and denom.
 * Use common denom. to add, then reduce the lowest common denom.
 * (first grade)
 * add, subtract, multiply, divide(second part of grading)
 * @author Nicholas Schroeder
 *
 */
public class Fraction {
	
	
	
	
	
	private int numerator1, denominator1,numerator2, denominator2;
	
	//int num1 = Integer.parseInt(numerator1);
	//int denom1 = Integer.parseInt(denominator1);
	//int num2 = Integer.parseInt(numerator2);
	//int denom2 = Integer.parseInt(denominator2);
	private int num1, denom1, num2, denom2;
	private int finalNumerator;
	private int finalDenominator;
	public int fracAdd, setDenom1, setNum1, setDenom2, setNum2, finalDenom, finalNum, baseFraction, remainder;
	public String frac1 = num1+"/"+denom1;
	public String frac2 = num2+"/"+denom2;
	
	
	public Fraction(String passFraction, String passFraction2) {

		int separatorLocation = passFraction.indexOf("/");
		String strNumerator = passFraction.substring(0,
				separatorLocation);
		String strDenominator = passFraction.substring(separatorLocation + 1);

		this.num1 = Integer.parseInt(strNumerator);
		this.denom1 = Integer.parseInt(strDenominator);
		int separatorLocation2 = passFraction2.indexOf("/");
		String strNumerator2 = passFraction2.substring(0,
				separatorLocation2);
		String strDenominator2 = passFraction2.substring(separatorLocation2 + 1);

		this.num2 = Integer.parseInt(strNumerator2);
		this.denom2 = Integer.parseInt(strDenominator2);


		
	}

	

	public int getNumerator() {
		return num1;
	}
	
	public void setNumerator(int numerator1) {
		
		this.num1 = numerator1;
	}

	public int getDenominator() {
		return denom1;
	}

	public void setDenominator(int denominator1) {
		this.denom1 = denominator1;
	}
	
	

	public int getNumerator2() {
		return num2;
	}
	
	public void setNumerator2(int numerator2) {
		
		this.num2 = numerator2;
	}

	public int getDenominator2() {
		return denom2;
	}

	public void setDenominator2(int denominator2) {
		this.denom2 = denominator2;
	}
	
	public String addFrac() {
		if (denom1 == denom2) {
			finalDenom = denom1;
			finalNum = num1 + num2;
		}
		else {
			setDenom1 = denom1 * denom2;
			setNum1 = num1 * denom2;
			setDenom2 = denom2 * denom1;
			setNum2 = num2 * denom1;
			finalNum = setNum1 + setNum2;
			finalDenom = setDenom1;
		}
		System.out.println(finalNum);
		System.out.println(finalDenom);
		int baseFraction = finalNum / finalDenom;
		int remainder = finalNum % finalDenom;
		System.out.println(baseFraction);
		System.out.println(remainder);
		String finalFrac = baseFraction+" "+ remainder+"/"+finalDenom;
		return finalFrac;
		
	}
/*	public int addFrac2() {
		System.out.println(finalDenom);
		return finalDenom;
	}
*/
	public void simpleFrac() {
		
	}
	/*public static int findGCD(int finalNum, int finalDenom) {
        //base case
        if(finalDenom == 0){
            return finalDenom;
        }
        return findGCD(finalDenom, finalNum%finalDenom);       
        
    }*/
	

	
}



	
	

