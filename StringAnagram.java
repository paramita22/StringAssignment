package stringsP;
//to prove two strings are anagrams:1]remove spaces->2]sort->3]compare length
import java.util.*;
public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		str1=str1.replace(" ","");
		System.out.println(str1);
		str2=str2.replace(" ", "");
		System.out.println(str2);
		String temp1="",temp2="";
		String st1=str1.toLowerCase();
		String st2=str2.toLowerCase();
			for(char c='a';c<'z';c++) {
				for(int i=0;i<st1.length();i++) {
					if(c==st1.charAt(i)) {
				temp1+=st1.charAt(i);
			}
		}
		}
		System.out.println(temp1);
		for(char c='a';c<'z';c++) {
			for(int i=0;i<st2.length();i++) {
				if(c==st2.charAt(i)) {
					temp2+=st2.charAt(i);
				}
			}
		}
		System.out.println(temp2);
		if(temp1.compareTo(temp2)==0){
			System.out.println("The two Strings are Anagrams");
		}
		else {
			System.out.println("The two Strings are not Anagrams");
		}
		}

	}

