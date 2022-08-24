package stringsP;
import java.util.*;
public class RepeatChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		char ch[]=new char[20];
		int count=1,index=0;
		System.out.println("The repeated characters in the String are:");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)&&str.charAt(i)!=' ') {
				ch[i]=str.charAt(i);
				index++;
				str=str.replace(str.charAt(j),' ');
				System.out.println((count++)+"->"+ch[i]);
			}
			}
			index=0;
		}
		sc.close();
	}

}
