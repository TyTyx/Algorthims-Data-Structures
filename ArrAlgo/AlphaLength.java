import java.util.*;

public class AlphaLength{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		String words[] = new String[number];
		for (int i = 0; i < number; i++) {
			words[i] = scan.nextLine();
		}

		for (int j = number-1; j > 0; j--) {
			for(int k = 0; k < j; j++) {
				if(check(words[k], check[k+1])) {
					String temp = words[k];
					words[k] = words[k+1];
					words[k+1] = temp;
				}
			}
		}
		for(int i = 0; i < number; i++) {
			System.out.print(words[i]);
			System.out.print(" ");
		}
	}

	public static boolean check(String one, String two) {
		if(one.length() > two.length())
			return true;
		else if(two.length() > one.length())
			return false;
		else if(one.compareTo(two) > 0)
			return true;
		else
			return false;
	}
}