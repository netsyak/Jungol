package q9027;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();

		int n3 = (int) n1;
		int n4 = (int) n2;

		System.out.print((int) (n1 + n2)+ " ");
		System.out.print(n3 + n4);

		sc.close();
	}
}
