package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int base = sc.nextInt();
			int height = sc.nextInt();
			System.out.print("Base = " + base);
			System.out.print("Height = " + height);
			double trianglewidth = (double) (base * height) / 2;
			System.out.printf("Triangle width = %.1f\n", trianglewidth);

			System.out.print("Continue? ");

			char ans = sc.next().charAt(0);
			if (ans == 'y' || ans == 'Y') {
			} else {
				sc.close();
				break;
			}
		}
	}

}
