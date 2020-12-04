package Roaches;
import java.util.Scanner;
public class roachSimulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		roachPopulation bugs = new roachPopulation(10);
		int roaches;
		
		System.out.println("The initial roach population is 10");
		
		for (int i = 1; i <= 4; i++) {
			bugs.breed();
			roaches = bugs.getRoaches();
			System.out.println("The Roach population after cycle " + i + " breeding is " + roaches);
			bugs.spray((40 + (10 * i)));
			roaches = bugs.getRoaches();
			System.out.println("The Roach population after cycle " + i + " " + (40 + (10 * i)) + " percent spraying is " + roaches);
		}
	in.close();
	}

}
