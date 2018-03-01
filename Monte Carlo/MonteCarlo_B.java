/*
 *	READ IN A NUMBER OF FAIR COIN TOSSES, AND A TARGET NUMBER OF HEADS
 *	OUTPUT PROBABILITY THE TARGET NUMBER OF HEADS IN A ROW WILL BE TOSSED @ SOME POINT
*/

import java.util.*;

public class MonteCarlo_B{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double toss = scan.nextDouble();
		double head = scan.nextDouble();

		double count = 0;
		double = simulations = 100000;

		for (int i = 0; i < simulations; i++) {
			int probability = 0;
			int record = 0;
			for (int j = 0; j < toss; j++) {
				if(Math.random() > 0.5){
					probability++;
					if(probability > record)
						record = probability;
				}
				else
					probability = 0;
			}
			if(record >= head)
				count++;
		}
		System.out.println(count*100/simulations);
	}
}