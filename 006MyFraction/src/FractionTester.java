import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FractionTester {

		public static void main(String[] args) {
			

			String numerator1 = JOptionPane.showInputDialog("Enter the first Numerator:");
			String denominator1 = JOptionPane.showInputDialog("Enter the first Denominator:");
			String numerator2 = JOptionPane.showInputDialog("Enter the second Numerator:");
			String denominator2 = JOptionPane.showInputDialog("Enter the second Denominator:");
			Fraction myFraction = new Fraction(numerator1+"/"+denominator1,numerator2+"/"+denominator2 );
			//int finalNum = myFraction.addFrac()/myFraction.findGCD(myFraction.addFrac(), myFraction.addFrac2());
			//int finalDenom = myFraction.addFrac2()/myFraction.findGCD(myFraction.addFrac(), myFraction.addFrac2());
			
			myFraction.simpleFrac();
				JOptionPane.showMessageDialog(null, "Fraction1 = "+numerator1+"/"+denominator1+"\nFraction2 = "+numerator2+"/"+denominator2);
				JOptionPane.showMessageDialog(null,("The added Fraction is"+" "+myFraction.addFrac()));
		        
		
				
				//System.out.println("Numerator: " + myFraction.getNumerator() + ", Denominator: " + myFraction.getDenominator());
				//System.out.println("Numerator: " + myFraction.getNumerator2() + ", Denominator: " + myFraction.getDenominator2());
				//System.out.println("Added fraction is " + myFraction.addFrac());
				
		}
	
}
