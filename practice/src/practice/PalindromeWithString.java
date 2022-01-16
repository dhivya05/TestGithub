package practice;
import java.util.Scanner;
public class PalindromeWithString {

	public static void main(String[] args) {
		String str="";
		String rstr="";
		System.out.println("Enter a string");
		Scanner sc =new Scanner(System.in);
		str =sc.nextLine();
		int length=str.length();//madam
		for(int i=length-1;i>=0;i--) {
			rstr=rstr+str.charAt(i);
		}
		if(str.equals(rstr)){
			System.out.println("The string is a palindrome");
			
		}
		else {
			System.out.println("The string is not a palindrome");
		}
		
		
	}

}

