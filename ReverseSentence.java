package stringsP;
//program to reverse a sentence while preserving the position
import java.util.*;
public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");//the program shall work on any sentence
		String str=sc.nextLine();
		String s="",s1="";
		for(int i=str.length()-1;i>=0;i--) {
			s=s+str.charAt(i);
			if(str.charAt(i)==' ') {
				s=s+" ";
		}
		}
		System.out.println("The reversed sentence is:"+s);
	}

}
