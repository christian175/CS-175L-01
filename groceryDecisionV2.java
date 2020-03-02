import java.util.Scanner;
public class groceryDecisionV2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.print("Enter the price of your groceries or \"0\" to end the program: ");
			String in = input.nextLine();
			double price = 0;
			try {
				price = Double.parseDouble(in);			    		
			} catch (NumberFormatException ex) {
				System.out.println("Error, that is not a valid input.");
			}
			double discount;
			if (price == 0) {
				on = false;
			}
			else if (price < 1000) {
				if (price < 0) {
					System.out.println("Error, that is not a valid number.");
				}
				else if (price < 10) {
					System.out.println("You are not eligible for a coupon at this time.");
				}
				else if (price < 60) {
					discount = price * 0.08;
					System.out.printf("you win a discount of %6.2f%n", discount);
				}
				else if (price < 150) {
					discount = price * 0.1;
					System.out.printf("you win a discount of %6.2f%n", discount);
				}
				else if (price < 210) {
					discount = price * 0.12;
					System.out.printf("you win a discount of %6.2f%n", discount);
				}
				else {
					discount = price * 0.14;
					System.out.printf("you win a discount of %6.2f%n", discount);
				}
			}
			else {
				System.out.println("Error, too high.");
			}
		}

	}

}
