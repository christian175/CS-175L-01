import java.util.Scanner;
public class hello {

    public static void main(String[] args) {
    	int year = 0;
    	double balance = 10000;
    	double target = 3 * balance;
    	while (balance < target) {
    		balance = balance + (balance * .1);
    		year++;
    		System.out.println("Year: " + year + "Balance: " + balance);
    	}
    	
    	System.out.println("after " + year + " years, the balance is doubled");
    }
}