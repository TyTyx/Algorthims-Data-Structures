/*
	FIND THE MODE
*/

import java.util.*;

public class mode{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int data[] = new int[number];

		for(int i = 0; i < number; i++){
			data[i] = scan.nextInt();
		}
		int record = 0;
		int record_num = 0;
		for(int j = 0; j < number; j++){
			int count = 0;
			for(int k = 0; k < number; k++){
				if(data[j] == data[k])
					count++;
			}
			if(count > record){
				record = count;
				record_num = data[j];
			}
		}
		System.out.println(record_num);
	}
}