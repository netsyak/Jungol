package q9028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.printf("%d / 4 = %d\n", num, num / 4);
		System.out.printf("%d / 4.0 = %.2f", num, num / 4.0);

		sc.close();
	}

}
