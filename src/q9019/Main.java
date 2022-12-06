package q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("5개의 수를 입력하시오. ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		System.out.print(num1 + 3 + " ");
		System.out.print(num2 - 3 + " ");
		System.out.print(num3 * 3 + " ");
		System.out.print(num4 / 3 + " ");
		System.out.print(num5 % 3);
		sc.close();
	}

}
