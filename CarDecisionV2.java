import java.util.Scanner;
public class CarDecisionV2 {

	public static void main(String[] args) {
			//taking in input for calculations
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter info for regular car: ");//ToyotaCorolla,28000,20
	    String regCar = input.nextLine();
	    String[] regular = regCar.split(",");
	    System.out.print("Enter info for hybrid car: "); //ToyotaPrius,31000,30
	    String hybridCar = input.nextLine();
	    String[] hybrid = hybridCar.split(",");
	    //String regMakeModel = regCar.substring(0, 13);
	    //String hybridMakeModel = hybridCar.substring(0,11);
	    double regCarCost = Double.parseDouble(regular[1]);
	    double regMPG = Double.parseDouble(regular[2]);
	    double hybridCarCost = Double.parseDouble(hybrid[1]);
	    double hybridMPG = Double.parseDouble(hybrid[2]);
	    double gasCost = 2.50;
	    double miles = 15000;
	    //calculating yearly cost
	    double regGas = miles / regMPG * gasCost;
	    double hybridGas = miles / hybridMPG * gasCost;
	    double regCarTotal;
	    double hybridTotal;
	    for (int i = 1; i < 6 ; i++ ) {
        //calculating cost each year and printing values
	    	regCarTotal = regCarCost + i * (regGas);
	    	hybridTotal = hybridCarCost + i * (hybridGas);
	    	System.out.println("The cost to buy and use a " + regular[0] + " for " + i + " year(s) is " + regCarTotal);
	        System.out.println("The cost to buy and use a " + hybrid[0] + " for " + i + " year(s) is " + hybridTotal);
	        if (hybridTotal < regCarTotal && i == 5) {
	            System.out.println("The " + hybrid[0] + " pays back after 5 years");
	          }
	    }

		}
}
