/*
	FIND THE CLOSEST TO THE AVERAGE
*/

import java.util.*;

public class closest_average{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int array[] = new int[number];

		double sum = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();
			sum = sum + array[i];
		}

		double average = (sum/array.length);
		double closest = Math.abs(array[0] - average);
		int index = 0;

		for(int j = 0; j < array.length; j++){
			if(Math.abs(array[j] - average) < closest){
				closest = Math.abs(array[j] - average);
				index = j;
			}
		}
		System.out.println(array[index]);
	}
}