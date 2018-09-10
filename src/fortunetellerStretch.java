import java.util.Scanner;

public class fortunetellerStretch {

	public static void main(String[] args) {
		//
		//
		// Requesting information and storing input in variables:
		//
		//
		Scanner input = new Scanner(System.in);

		// First Name entry
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		boolean quitFirstName = false;
		while (!quitFirstName) {
			if (firstName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				quitFirstName = true;

			}
		}

		// Last Name entry
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();

		boolean quitLastName = false;
		while (!quitLastName) {
			if (lastName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				quitLastName = true;

			}
		}

		// Age entry
		System.out.println("Enter your age: ");
		String ageEntry = input.nextLine();

		boolean quitAge = false;
		while (!quitAge) {
			if (ageEntry.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				quitAge = true;

			}
		}

		int age = Integer.parseInt(ageEntry);

		// Birth Month entry
		System.out.println("Enter your birth month (as an 'int'): ");
		String birthMonthEntry = input.nextLine();

		boolean quitBirthMonth = false;
		while (!quitBirthMonth) {
			if (birthMonthEntry.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				quitBirthMonth = true;

			}
		}

		int birthMonth = Integer.parseInt(birthMonthEntry);

		// Fav color entry
		System.out.println(
				"Enter your favorite ROYGBIV color. If you're unfamiliar with ROYGBIV, please type Help and press enter/return.");
		String color = input.nextLine();

		boolean weGood = false;
		while (!weGood) {
			if (color.equalsIgnoreCase("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			} else if (color.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				weGood = true;
			}
		}

		// Number of siblings entry
		System.out.println("Enter your number of siblings: ");
		String siblingsEntry = input.nextLine();

		boolean quitSiblings = false;
		while (!quitSiblings) {
			if (siblingsEntry.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else {
				quitSiblings = true;

			}
		}

		int siblings = Integer.parseInt(siblingsEntry);
		input.close();

		//
		//
		// Time for maths.
		//
		//

		// Retirement years based on odd or even nature of age

		int ageOddEven = (age % 2);
		int retireAge = (age * 2);
		if (ageOddEven > 0) {
		} else {
			retireAge = (age * 3);
		}

		// Where will they live based on number of siblings.
		String vacationHome = ("Arkham Asylum");
		if (siblings < 0) {
		} else if (siblings == 0) {
			vacationHome = ("Santa Ana, CA");
		} else if (siblings == 1) {
			vacationHome = ("Ft. Collins, CO");
		} else if (siblings == 2) {
			vacationHome = ("Houston, TX");
		} else if (siblings == 3) {
			vacationHome = ("Snoqalmie, WA");
		} else if (siblings > 3 && siblings < 10) {
			vacationHome = ("Pittsburgh, PA");
		} else {
			vacationHome = ("a tent in the back yard of one of their many siblings");
		}

		// Mode of transportation based on favorite color
		String transportation = ("a Corvette");
		if (color.equalsIgnoreCase("red")) {
		} else if (color.equalsIgnoreCase("orange")) {
			transportation = ("hot air balloon");
		} else if (color.equalsIgnoreCase("yellow")) {
			transportation = ("time machine");
		} else if (color.equalsIgnoreCase("green")) {
			transportation = ("a 1969 Shelby GT500");
		} else if (color.equalsIgnoreCase("blue")) {
			transportation = ("Batmobile");
		} else if (color.equalsIgnoreCase("indigo")) {
			transportation = ("Lime scooter");
		} else if (color.equalsIgnoreCase("violet")) {
			transportation = ("Pope mobile");
		} else {
			transportation = ("COTA");
		}

		// Account balance based on birth Month
		String bankBalance = ("$0.00");
		if (birthMonth <= 0) {
		} else if (birthMonth >= 1 && birthMonth < 5) {
			bankBalance = ("$1,1235.81");
		} else if (birthMonth >= 5 && birthMonth < 9) {
			bankBalance = ("#3,141,592,653.59");
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			bankBalance = ("$86,753.09");
		} else {
			bankBalance = ("pocket lint, three buttons, and a Blockbuster gift certificate for one free rental.");
		}

		// Display the fortune!
		System.out.println(firstName + " " + lastName + " " + " will retire in " + retireAge + " years with "
				+ (bankBalance) + " in the bank, a vacation home in " + vacationHome + ", and travel by "
				+ (transportation) + ".");

	}

}
