/*
Excercise 6.18
   Project 5
   CS130 - Introduction to JAVA 
   Fatai D. Sule
*/
import java.util.Scanner;
public class CheckPassword {

   public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// Prompt the user to enter a password
		System.out.print("Enter a password: ");
		String passwd = input.nextLine();

		// Display Valid Password or Invalid Password
		System.out.println(
			(isValidPassword(passwd) ? "Valid " : "Invalid ") + "Password");
	}

	// Method isPasswordVaild tests if string is a valid pword 
	public static boolean isValidPassword(String pword) {
		final int LENGTH_OF_PASSWORD = 8;	
	   final int NUMBER_OF_DIGITS = 2;	

		boolean validPassword = 
			isLengthValid(pword, LENGTH_OF_PASSWORD) && 
			containsLettersAndDigits(pword) &&
			hasDigits(pword, NUMBER_OF_DIGITS);

		return validPassword;
	}

	// Method isLengthValid tests whether a string is a valid length 
	public static boolean isLengthValid(String pword, int validLength) {
		return pword.length() >= validLength;
	}

	// Method containsLettersAndDigits tests if a string contains letters alone
   
	public static boolean containsLettersAndDigits(String pword) {
		for (int i = 0; i < pword.length(); i++) {
			if (!Character.isLetterOrDigit(pword.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	// Method hasDigits tests if a string contains digits 
	public static boolean hasDigits(String pword, int n) {
		int numberOfDigits = 0;
		for (int i = 0; i < pword.length(); i++) {
			if (Character.isDigit(pword.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= n) {
				return true;
			}
		}
		return false;
	}
}