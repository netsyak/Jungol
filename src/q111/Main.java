package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = a+b+c+d;
		sc.close();

		int sum = e;
		int avg = e/ 4;
		System.out.println("sum " + sum);
		System.out.printf("avg " + avg);

	}

}
