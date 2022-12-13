package q527;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.print(n1 / n2 + " ");
		System.out.printf("%.2f", (double) n1 / (double) n2);

		sc.close();
	}

}
