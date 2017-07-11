package hunter;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String");
Scanner s=new Scanner(System.in);
String a=s.next();
StringBuffer b=new StringBuffer(a).reverse();
String c=b.toString();
if(a==c) {
	System.out.println("The String is a Palindrome");
}
else {
	System.out.println("The String is not  Palindrome");
}
	}

}
