/*
	FIND THE SECOND BIGGEST
*/

import java.util.*;

public class second_biggest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int record = Integer.MIN_VALUE;
		int record_two = Integer.MAX_VALUE;

		for(int i = 0; i < num; i++){
			int input = scan.nextInt();
			if(input > record){
				record_two = record;
				record = input;
			}
			else{
				if(input > record_two)
					record_two = input;
			}
		}
		System.out.println(record_two);
	}
}