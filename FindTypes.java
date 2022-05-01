package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray1 = test.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
			if (Character.isLetter(charArray1[i])) 
				letter++;
			else if (Character.isDigit(charArray1[i])) 
				num++;
			else if (Character.isSpaceChar(charArray1[i])) 
				space++;
			else
				specialChar++;
		}

		System.out.println("Letter:" + letter);
		System.out.println("Number:" + num);
		System.out.println("Space:" + space);
		System.out.println("SpecialCharacter:" + specialChar);
	}
}

