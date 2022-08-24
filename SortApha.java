package stringsP;
import java.util.*;
public class SortApha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be sorted alphabetically:");
		String str=sc.nextLine();
		String temp="";
		str=str.toUpperCase();
		for(char c='A';c<='Z';c++) {
			for(int i=0;i<str.length();i++) {
				if(c==str.charAt(i)) {
				temp+=str.charAt(i);
				}
			}
		}
		System.out.println("The sorted String is: "+temp.toLowerCase());
		sc.close();

	}

}
