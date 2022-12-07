package q633X;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japen");
			System.out.println("4. china");
			System.out.print("number?");
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				// System.out.printf("%n");
				System.out.println("Seoul");
				// System.out.printf("%n");
			} else if (a == 2) {
				// System.out.printf("%n");
				System.out.println("Washington");
				// System.out.printf("%n");
			} else if (a == 3) {
				// System.out.printf("%n");
				System.out.println("Tokyo");
				// System.out.printf("%n");
			} else if (a == 4) {
				// System.out.printf("%n");
				System.out.println("beijing");
				// System.out.printf("%n");
			} else {
				// System.out.printf("%n");
				System.out.println("none");
				//System.out.printf("%n");
				break;
			}
			sc.close();

		}
	}
}
