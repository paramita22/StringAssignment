package stringsP;
import java.util.*;
public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given String: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String s=str.replace(" ", "");
		System.out.println(s);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					count++;
				}
			}
		System.out.println("The number of vowels in the entered String are="+count+"\nThe number of consonants in the entered String are="+(s.length()-count));
	}

}
