package stringsP;
import java.util.*;
public class SpecialCharCount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String with special characters: ");
	String str=sc.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>=48&&str.charAt(i)<=57||str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122) {
			count++;
		}
	}
	int temp=str.length()-count;
	System.out.println("Number of special characters in the entered string are: "+temp);
	}

}
