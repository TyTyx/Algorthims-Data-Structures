import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mystring = scan.nextLine();
		System.out.println(check(palindrome));
	}

	public static String check(String mystring) {
		/* Enter your code here. Define substring below. */

		if (mystring.length() < 2) 
			return "TRUE";
		if (mystring.charAt(0) != mystring.charAt(mystring.length()-1))
			return "FALSE";

		String substring = mystring.substring(1, mystring.length()-1);

		return (check(substring));
	}
}