package week2.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String [] s1 = test.split(" ");
		for (int i=0; i <s1.length; i++) {
			if (i%2==1)
			{
				StringBuilder sb=new StringBuilder(s1[i]);
				s1[i]=sb.reverse().toString();
				System.out.println(s1[i]);
			}
			else
			{
				System.out.println(s1[i]);
			}
		}
	}

}
