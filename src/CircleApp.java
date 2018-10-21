import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Circle usrCircle = new Circle();
		boolean cont;
		int count = 1;

		do {
			usrCircle.radius = Validator.getDouble(sc, "Please enter circle radius: ", Double.MIN_VALUE,
					Double.MAX_VALUE);
			System.out.println("Circumference is " + usrCircle.getFormattedCircumference());
			System.out.println("Area is " + usrCircle.getFormattedArea());
			System.out.println("Would you like to continue? y/n");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("y")) {
				count++;
				cont = true;
			} else {
				System.out.println("GoodBye!  You entered " + count + " circles.");
				cont = false;
			}

		} while (cont == true);

	}

}
