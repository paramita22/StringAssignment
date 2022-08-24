package stringsP;
import java.util.*;
public class StringPangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean[]mark=new boolean[26];
		int index=0,flag=0;
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				index=str.charAt(i)-'A';
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				index=str.charAt(i)-'a';
			}
			mark[index]=true;
			flag=1;
		}
		for(int i=0;i<=25;i++) {
			if(mark[index]==false) {
				flag=0;
			}
		}
		if(flag==1) {
				System.out.println("The String is not a pangram");
			}
			else {
				System.out.println("The String is a pangram");
			}
		sc.close();
	}

}
