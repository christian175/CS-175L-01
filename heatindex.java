import java.util.Scanner;
public class heatindex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		int T = 0;
		int RH = 0;
		double THI=0;
		
		for (T = 80; T <= 110; T = T + 2) {
			System.out.printf("%5d", T);
		}
		System.out.println("");
		System.out.println("______________________________________________________________________________________");
		for (RH = 40; RH <= 100; RH = RH + 5)
		{
			System.out.printf("%3d | ",RH);
			for (T = 80; T <= 110; T = T + 2)
			{
				THI =  -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH;
				THI = Math.round(THI);
				System.out.printf("%5.0f",(THI));
			}
			System.out.println(); 
		}

		while (on) {
			System.out.print("Please enter the temperature (in farenheit) or \"0\" to end: ");
			T = input.nextInt();
			System.out.print("Please enter the relative humidity: ");
			RH = input.nextInt();
			if (T == 0) {
				on = false;
			}
			else {
				System.out.println((int)THI);
			}
		}

	}

}
