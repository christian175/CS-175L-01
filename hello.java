import java.util.Scanner;
public class hello {

    public static void main(String[] args) {
    	System.out.print("Are you single?(Y/N) ");
    	Scanner input = new Scanner(System.in);
    	String status = input.next();
    	status = status.toUpperCase();
    	System.out.print("What is your income? ");
    	double income = input.nextDouble();
    	final double RATE1 = 0.10;
    	final double RATE2 = 0.25;
    	final double SINGLE_LIMIT = 32000;
    	final double MARRIED_LIMIT = 64000;
    	
    	double tax1 = 0;
    	double tax2 = 0;
    	if (status.contentEquals("Y")) {
    		if (income <= SINGLE_LIMIT) {
    			tax1 = income * RATE1;
    		}
    		else {
    			tax1 = SINGLE_LIMIT * RATE1;
    			tax2 = RATE2 * (income - SINGLE_LIMIT);
    		}
    	}
    	else {
    		if (income <= MARRIED_LIMIT) {
    			tax1 = RATE1 * income;
    		}
    		else {
    			tax1 = RATE1 * MARRIED_LIMIT;
    			tax2 = RATE2 * (income - MARRIED_LIMIT);
    		}
    	}
    	double taxTotal = tax1 + tax2;
    	System.out.println("Your tax is " + taxTotal);
    }
}
