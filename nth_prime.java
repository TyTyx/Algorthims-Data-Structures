/*
	FIND THE NTH PRIME
*/

import java.util.*;

public class nth_prime{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = nextInt();
		int count = 1;
		int prime_num = 0;

		while(prime_num != x){
			count++;
			boolean prime = true;
			for (int i = 2; i < count; i++) {
				if (count%i == 0)
					prime = false;
			}
			if (prime)
				prime_num++;
		}
		System.out.println(count);
	}
}