package stringsP;
//program to Reverse a String
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the given String:");//Here user input is asked
	String str=sc.next();//user input accepted||str="iNeuron" may be taken
	String s="";
	char ch=' ';
	for(int i=str.length()-1;i>=0;i--) {
		ch=str.charAt(i);
		s=s+ch;
	}
	System.out.println("The reversed String is:"+s);
	}

}
