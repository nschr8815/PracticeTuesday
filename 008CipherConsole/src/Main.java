
public class Main {
	/*
	 * ask if they want to go again
	 * for dev, syso scanner are fine
	 * for ops, change to JOPs - graded!
	 */
	/*
	switch (crypt) {
	case "E";
	System.out.println("You have chosen to encrypt");
	break;
	case "E";
	System.out.println("You have chosen to decrypt");
	break;
	
	}
*/

	public static void main(String[] args) {
		Cipher openCaesar = new Cipher();
		String playing = "true";
		while (playing.equals("true")) {
		String crypt = openCaesar.encryptDecrypt();
		
		if(crypt.equals("E")) {
			crypt = "nothing";
			openCaesar.getPlainText();
			openCaesar.getKey();
			openCaesar.encrypt();
			
			playing = openCaesar.again();
			
			
		}
		if(crypt.equals("D")) {
			crypt = "nothing";
			openCaesar.getPlainText();
			openCaesar.getKey();
			openCaesar.decrypt();
			playing = "false";
			playing = openCaesar.again();
			
		}
		
		}//while

	}

}