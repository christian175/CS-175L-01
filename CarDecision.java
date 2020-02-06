import java.util.Scanner;

public class CarDecision{

  public static void main(String[] args){
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

    double regGas = regCarMPG * gasCost * miles;
    double regCarTotal;
    double hybridGas = hybridCarMPG * gasCost * miles;
    double hybridTotal;
    for (int i = 1; i < 6 ; i++ ) {
      regCarTotal = regCarCost + i * (regGas);
      hybridTotal = hybricCarCost + i * (hybridGas);
      System.out.println("The cost to buy and use a regular car for " + i + " year(s) is " + regCarTotal);
      System.out.println("The cost to buy and use a hybrid car for " + i + " year(s) is " + hybridTotal);
    }
    if (hybridTotal < regCarTotal) {
      System.out.println("The hybrid car pays back after 5 years");
    }
  }
}
