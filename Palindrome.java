package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		// Declare string and reverse string
		String str = "Madam";
		String rev = "";
		// Finding length of the string
		int len = str.length();
		// Reversing the string
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		// Checking Actual string is equal to reverse string
		if (rev.equalsIgnoreCase(str)) {
			// Print the string is palindrome
			System.out.println(str + " " + "is a Palindrome");
		} else {
			System.out.println(str + " " + "is not a Palindrome");

		}
	}

}
