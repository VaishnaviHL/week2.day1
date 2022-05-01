package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String text1 = "welcome to chennai";
		int j = 0;
		char[] array = text1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'e') {
				j = j + 1;
			}
		}
		System.out.println("Number of occurence of e in" + " " + text1 + " " + "is" + " " + j);

	}

}
