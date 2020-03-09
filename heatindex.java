import java.util.Scanner;
public class heatindex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		double T = 0;
		double RH = 0;
		double THI =  -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH;
		for (T = 80; T <= 80; T = T + 2) {
			System.out.printf("%.2f");
		}


		while (on) {
			System.out.print("Please enter the temperature (in farenheit) or \"0\" to end: ");
			T = input.nextDouble();
			System.out.print("Please enter the relative humidity: ");
			RH = input.nextDouble();
			if (T == 0) {
				on = false;
			}
		}

	}

}
