/*
	FIND THE OUTLIER
*/

import java.util.*;

public class outlier{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();

		int min = Math.min(Math.min(one, two), three);
		int max = Math.max(Math.max(one, two), three);
		int middle = one + two + three - (min + max);

		if(Math.abs(min - middle) == Math.abs(max - middle))
			System.out.println("NA");
		else if(Math.abs(min - middle) > Math.abs(max - middle))
			System.out.println(min);
		else
			System.out.println(max);
	}
}