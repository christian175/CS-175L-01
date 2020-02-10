import java.util.Scanner;
public class CarDecisionV2 {

	public static void main(String[] args) {
		//taking in input for calculations
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter info for regular car: ");//ToyotaCorolla,28000,20
	    String regCar = input.next();
	    System.out.print("Enter info for hybrid car: "); //ToyotaPrius,31000,30
	    String hybridCar = input.next();
	    String regMakeModel = regCar.substring(0, 13);
	    String hybridMakeModel = hybridCar.substring(0,11);
	    double regCarCost = Double.parseDouble(regCar.substring(14, 19));
	    double regMPG = Double.parseDouble(regCar.substring(20));
	    double hybridCarCost = Double.parseDouble(hybridCar.substring(12, 17));
	    double hybridMPG = Double.parseDouble(hybridCar.substring(18));
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
	    	System.out.println("The cost to buy and use a " + regMakeModel + " for " + i + " year(s) is " + regCarTotal);
	        System.out.println("The cost to buy and use a " + hybridMakeModel + " for " + i + " year(s) is " + hybridTotal);
	        if (hybridTotal < regCarTotal && i == 5) {
	            System.out.println("The " + hybridMakeModel + " pays back after 5 years");
	          }
	    }
	}

}
