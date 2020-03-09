import java.util.Scanner;
public class calculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.print("How Many classes did you take this semester? ");
		int courses = in.nextInt();
		double gp1 = 0;
		double gp2 = 0;
		double gp3 = 0;
		double gp4 = 0;
		double gp5 = 0;
		double GPA = 0;
		double credits;
		final String QUIT = "0";
		String info = "";
		String infoArr[] = {""};
		double grade = 0;
		for (int i = 1; i <= courses; i++) {
			System.out.print("Enter course " + (i) + " information (title, credits, letter grade) or \"Q\" to quit:");
			info = input.nextLine();
			infoArr = info.split(",");
			if (infoArr[0].equals(QUIT)) {
				break;
			}
			else if (infoArr[2].equals("A")) {
				grade = 4;
			}
			else if (infoArr[2].equals("A-")) {
				grade = 3.70;
			}
			else if (infoArr[2].equals("B+")) {
				grade = 3.33;
			}
			else if (infoArr[2].equals("B")) {
				grade = 3.00;
			}
			else if (infoArr[2].equals("B-")) {
				grade = 2.70;
			}
			else if (infoArr[2].equals("C+")) {
				grade = 2.33;
			}
			else if (infoArr[2].equals("C")) {
				grade = 2.00;
			}
			else if (infoArr[2].equals("C-")) {
				grade = 1.70;
			}
			else if (infoArr[2].equals("D+")) {
				grade = 1.33;
			}
			else if (infoArr[2].equals("D")) {
				grade = 1.00;
			}
			else if (infoArr[2].equals("D-")) {
				grade = 0.7;
			}
			else if (infoArr[2].equals("F")) {
				grade = 0;
			}
			credits = Double.parseDouble(infoArr[1]);

			System.out.println("Course: " + infoArr[0] + "  Credits: " + infoArr[1] + "  Grade: " + infoArr[2]);
			if (i == 1) {
				gp1 = credits * grade;
			}
			else if (i == 2) {
				gp2 = credits * grade;
			}
			else if (i == 3) {
				gp3 = credits * grade;
			}
			else if (i == 4) {
				gp4 = credits * grade;
			}
			else if (i == 5) {
				gp5 = credits * grade;
			}

		}
		GPA = (gp1 +  gp2 + gp3 +  gp4 +  gp5)/ courses;
		System.out.printf("GPA: %.2f", GPA);
	}

}
