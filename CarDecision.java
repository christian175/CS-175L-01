import java.util.Scanner;
public class cardecision {

	public static void main(String[] args) {
		//taking in input for calculations
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter cost of regular car: ");
	    double regCarCost = input.nextDouble();
	    System.out.print("Enter MPG of regular car: ");
	    double regCarMPG = input.nextDouble();
	    System.out.print("Enter cost of hybrid car: ");
	    double hybridCarCost = input.nextDouble();
	    System.out.print("Enter MPG of hybrid car: ");
	    double hybridCarMPG = input.nextDouble();
	    System.out.print("Enter miles traveled in a year: ");
	    double miles = input.nextDouble();
	    System.out.print("Enter cost of gas per gallon: ");
	    double gasCost = input.nextDouble();
      //calculating yearly cost
	    double regGas = miles / regCarMPG * gasCost;
	    double hybridGas = miles / hybridCarMPG * gasCost;
	    double regCarTotal;
	    double hybridTotal;
	    for (int i = 1; i < 6 ; i++ ) {
        //calculating cost each year and printing values
	    	regCarTotal = regCarCost + i * (regGas);
	    	hybridTotal = hybridCarCost + i * (hybridGas);
	    	System.out.println("The cost to buy and use a regular car for " + i + " year(s) is " + regCarTotal);
	        System.out.println("The cost to buy and use a hybrid car for " + i + " year(s) is " + hybridTotal);
	        if (hybridTotal < regCarTotal && i == 5) {
	            System.out.println("The hybrid car pays back after 5 years");
	          }
	    }

	}
}
