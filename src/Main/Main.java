package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		System.out.println("Solution to Java challenge #2");
		while (true) {
			System.out.println("Enter an integer");
			Scanner scan = new Scanner(System.in);
		
			String input = scan.nextLine();
			
			BigInteger output = lookAndSay(input);
			
			System.out.println(output);
		}
		
		
	}
	
	public static BigInteger lookAndSay(String input) {
		BigInteger minusOne = new BigInteger("-1");
		if ((input.length()%2)==1)
			return minusOne;
		else {
			String[] storage = new String[input.length()/2];
			
			for (int i=0; i<(input.length()/2); i++) {
				String subString = input.substring(2*i, (2*i)+2);
				String temp = new String();
				
				String character= Character.toString(subString.charAt(1));
				
				int count = Character.getNumericValue(subString.charAt(0));
				for (int j=0; j<count; j++) {
					temp = temp.concat(character);
				}
				storage[i] = temp;
			}
			String concatonation = String.join("", storage);
			BigInteger result = new BigInteger(concatonation);
			return result;
		}
	}
}
