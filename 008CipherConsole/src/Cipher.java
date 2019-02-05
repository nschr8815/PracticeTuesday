import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Need master alphabet, 
 * @author compsci
 * 
 */
public class Cipher {
	String fileName = "/home/compsci/Downloads/Kennedy_Cuba_Crisis.txt";
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:;-,?![]\"";
	private String plainText = "";
	private String encodedText = "";
	private int key = 0;
	private String answer = "";
	private String playing = "";
	private String history = "";
	Scanner kbd = new Scanner(System.in);
	ArrayList<Character> outputWords = new ArrayList<Character>();
	ArrayList<Character> outputWords2 = new ArrayList<Character>();

	
	//toUpperCase();
	public String encryptDecrypt() {
		System.out.println("Enter e for Encrypt, Enter d for Decrypt");
		answer = JOptionPane.showInputDialog(null, "Enter e for Encrypt, Enter d for Decrypt"); 
		//answer = kbd.nextLine();
		answer = String.valueOf(answer.charAt(0)).toUpperCase();
		if (answer .equals("D")){
			System.out.println("You chose to decrypt");
			JOptionPane.showMessageDialog(null, "Choice: Decrypt"); 
			return(answer);
		}
		if (answer.equals("E") ){
			System.out.println("You chose to encrypt");
			JOptionPane.showMessageDialog(null, "Choice: Encrypt"); 
			return(answer);
		}
		return (null);

		
	}
	
	public void getPlainText() {
		
		System.out.println("Enter Text: ");
		plainText = JOptionPane.showInputDialog(null, "Enter Text: "); 
		//plainText = kbd.nextLine();
		plainText = plainText.toLowerCase();
		System.out.println("You have entered: " + plainText);
		JOptionPane.showMessageDialog(null, "You have entered: " + plainText); 
		System.out.println("------------------------------------------");
	}
	public void getKey() {
		System.out.println("What is your key");
		key = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "What is your key")); 
		//key = kbd.nextInt();
		System.out.println("Key: " + key);
		System.out.println("------------------------------------------");
	}
	
	public void encrypt() {
		if (answer .equals("E")){
			for (int i = 0; i < plainText.length() ; i++) {
				char character = plainText.charAt(i);
				String character1 = Character.toString(character);
				if (!alpha.contains(character1)) {
					outputWords.add(' ');
					history = history + outputWords.get(i).toString() + "";
				} else { 
				int index = alpha.indexOf(plainText.charAt(i));
				char encrypted = alpha.charAt((index + key) % alpha.length());
				outputWords.add(encrypted);
				//System.out.println(outputWords);
				history = history + outputWords.get(i).toString() + "";
				//System.out.println(history);
				}
		    }
			JOptionPane.showMessageDialog(null, "Key: " + key + "\n" + "Original: " + plainText + "\n" +  "Encrypted: " + history);
			System.out.println(history);
			history = "";
			System.out.println("------------------------------------------");
			
		}
		
	}
	
	public void decrypt() {
		if (answer .equals("D")){
		for (int i = 0; i < plainText.length() ; i++) {
			char character = plainText.charAt(i);
			String character1 = Character.toString(character);
			if(!alpha.contains(character1)) {
				outputWords2.add(' ');
				history = history + outputWords2.get(i).toString() + "";
			System.out.println("Original: " + character + " "+ "Decrypt: " + character);
			} else { 
			int index = alpha.indexOf(plainText.charAt(i));
			char decrypted = alpha.charAt((index - key) % alpha.length());
			outputWords2.add(decrypted);
			history = history + outputWords2.get(i).toString() + "";
			System.out.println("Original: " + character + " "+ "Decrypted: " + decrypted);
			//JOptionPane.showMessageDialog(null, "Original: " + character + " "+ "Decrypted: " + encrypted);
			
			}
	}
		JOptionPane.showMessageDialog(null, "Key: " + key + "\n" + "Original: " + plainText + "\n" + "Decrypted: " + history);
		System.out.println("------------------------------------------");
		history = "";
		}
	}
	
	public String again() { 
		System.out.println("Do you want to go again? (Y or N): ");
		playing = JOptionPane.showInputDialog(null, "Do you want to go again? (Y or N): ");
		//playing = kbd.nextLine();
		playing = playing.toUpperCase();
		
		if(playing.equals("Y") || playing.equals("YES")) {
			return("true");
		}
		if(playing.equals("N") || playing.equals("NO")){
			return("false");
		}else {
		return ("true");
		}
		
	}
	
	
	
	
	
	
	
}