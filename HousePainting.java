import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompting the user to input values and storing them
		System.out.print("Input house length: ");
		int houseLength = input.nextInt();
		System.out.print("Input house height: ");
		int houseHeight = input.nextInt();
		System.out.println("Input house width: ");
		int houseWidth = input.nextInt();
		System.out.print("Input amount of windows: ");
		int windowNum = input.nextInt();
		System.out.print("Input widow height: ");
		int windowHeight = input.nextInt();
		System.out.print("Input window length: ");
		int windowLength = input.nextInt();
		System.out.print("Input amount of doors: ");
		int doorNum = input.nextInt();
		System.out.print("Input door height: ");
		int doorHeight = input.nextInt();
		System.out.print("Input door length: ");
		int doorLength = input.nextInt();
		System.out.print("Input painter rate per square unit: ");
		int painterCost = input.nextInt();
		input.close();
		//performing the necessary calculations to find the price
		int noPeakSides =  houseLength *  houseWidth * 2;
		int peakSides = noPeakSides + ((1/2)*(houseLength*(houseHeight -  houseWidth)));
		peakSides = peakSides * 2;
		int windowSize =  windowNum * windowHeight * windowLength;
		int doorSize =  doorNum * doorLength * doorHeight;
		int sidesSize = peakSides + noPeakSides;
		int noPaint = windowSize + doorSize;
		int paintArea = sidesSize - noPaint;
		int totalCost =  paintArea * painterCost;
		//outputting the price
		System.out.println("Your total is: " + totalCost);


	}

}
