import java.util.*;

public class MedianScore{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		String namesandgrades = new String[num];
		for (int i = 0; i < num; i++) {
			namesandgrades[i] = scan.nextLine();
		}

		for (int j = num-1; j > 0; j--) {
			for(int k = 0; k < j; j++) {
				if(getGrade(namesandgrades[k] > getGrade[k+1])) {
					String temp = namesandgrades[k];
					namesandgrades[k] = namesandgrades[k+1];
					namesandgrades[k+1] = temp;
				}
			}
		}
		System.out.println(getName(namesandgrades[num-1/2]));
	}

	public static int getGrade(String input) {
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ')
				return Integer.parseInt(input.substring(i+1));
		}
		return -1;
	}

	public static int getName(String input) {
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ')
				return input.substring(0, i);
		}
		return "";
	}
}