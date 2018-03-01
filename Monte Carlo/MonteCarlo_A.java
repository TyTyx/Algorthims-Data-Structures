/*
 *	READ IN NUMBER OF FAIR COIN TOSSES, AND PROBABILITY THAT THE COIN TOSS WILL PRODUCE HEADS
 *	OUTPUT PROBABILITY THE MAJORITY OF COIN TOSSES WILL BE HEADS
*/

import java.util.*;

public class MonteCarlo_A{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double toss = scan.nextDouble();
		double bias = scan.nextDouble();

		double count = 0;
		double simulations = 100000;

		for(int i = 0; i < simulations; i++){
			double total = 0;
			for (int j = 0; j < toss; j++ ) {
				if(Math.random() < bias/100)
					total++;
			}
			if(total > toss/2)
				count++;
		}
		System.out.println(count*100/simulations);
	}
}