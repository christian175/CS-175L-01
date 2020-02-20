package grocerydiscount;
import java.util.Scanner;
public class grocerydiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of your groceries: ");
		double price = input.nextDouble();
		double discount;
		boolean on = true;
		while (on) {
			if (price == 0) {
				on = false;
			}
			else if (price < 0) {
				System.out.println("Error");
				on = false;
			}
			else if (price < 10) {
				System.out.println("You are not eligible for a coupon at this time");
			}
			else if (price < 60) {
				discount = price * 0.08;
				System.out.println("you are eligible for a discount of " + discount);
			}
			else if (price < 150) {
				discount = price * 0.1;
				System.out.println("you are eligible for a discount of " + discount);
			}
			else if (price < 210) {
				discount = price * 0.12;
				System.out.println("you are eligible for a discount of " + discount);
			}
			else {
				discount = price * 0.14;
				System.out.println("you are eligible for a discount of " + discount);
			}
		}
	}

}
