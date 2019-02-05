import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;



public class Reader {

	public static void main(String[] args)
	{
		String fileChoice = JOptionPane.showInputDialog("Enter the file path of the document you want to encrypt");
		String line;
		int charCount = 0;
		ArrayList aList = new ArrayList();
		ArrayList letters = new ArrayList();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int counter = 0;
		int alphaSize = alphabet.length();
		for (int i=0; i < alphaSize; i++) {
			//letters.add();
		}
		
		try {
			
			BufferedReader input = new BufferedReader(new FileReader(fileChoice));
			if(!input.ready()) {
				input.close();
				throw new IOException();
			}
			while ((line = input.readLine()) != null) {
				aList.add(line);
				for (int i =0; i < line.length(); i++) {
					counter += 1;
					String thisString = fileChoice;
					for (int l=0;l < thisString.length(); l++) {
						String readLine = aList.get(l).toString();
						for (int u=0; u < readLine.length(); u++) {
							String character = String.valueOf(readLine.charAt(u));
							System.out.println(character);
							if (character == "o") {
								charCount +=1;
								System.out.println("charCount");
							}
						}
					}
					//if (thisString.indexOf(i) == 15) {
					//		System.out.println("That was an O");
					//}
					
			
					
				}
			}
			
			input.close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		letters.add(counter);
			//test - did it work?
			int sz = aList.size();
			for (int i=0; i < sz; i++) {
				//System.out.println(aList.get(i).toString());
				
			}
			int size = letters.size();
			for (int i=0; i < size; i++) {
				System.out.println(letters.get(i).toString());

			}
			
		}// end of main()
	
	
	
	
	}
	
	
	

