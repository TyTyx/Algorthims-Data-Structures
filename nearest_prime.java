/*
	FIND THE NEAREST PRIME
*/

import java.util.*;

public class nearest_prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int count = 2;
		int answer = 0;
		int record = number;

		while(count < 2*number){
			boolean prime = true;
			for (int i = 2; i < count; i++) {
				if(count%i == 0)
					prime = false;
			}
			if(prime){
				if(Math.abs(number - count) < record){
					record = Math.abs(number - count);
					answer = count;
				}
			}
			count++;
		}
		System.out.println(answer);
	}
}