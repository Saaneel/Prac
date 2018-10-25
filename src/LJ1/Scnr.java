package LJ1;

import java.util.Scanner;

public class Scnr {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Name and press Enter : ");

		String line = in.nextLine();
		System.out.println("Welcome " + line.toUpperCase());

//{if (line.toString()) {System.out.println("Try Agane :");} }

		System.out.println("Password and press Enter");
		int n = in.nextInt();
		System.out.print("*** \n" + n);

		/*
		 * System.out.println("Enter your Number and press Enter"); double
		 * d=in.nextInt(); System.out.println("Your number is " + d);
		 */

		System.out.print("Confirm Password ; ");
		int nn = in.nextInt();
		{
			while (nn != n) {
				System.out.println("Wrong Password Try Again");
				nn = in.nextInt();
			}
			System.out.println("Password Confirm");

			System.out.println("Phone Number");
			// System.out.println("Phone Number Match" + p );
			int p = in.nextInt();
			int t = 0;
			System.out.println("Reconfirm Phone number");
			{
				do {
					if (p != t)
						;
					System.out.println("Not Match, try Again");
					t = in.nextInt();
				} while (t != p);
				System.out.println("Perfect");
			}
		}

	}
}
