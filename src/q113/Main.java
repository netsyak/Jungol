package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int length = sc.nextInt();
		sc.close();

		int a = (width + 5);
		int b = (length * 2);
		// int c = (a*b);
		System.out.println("width = " + a);
		System.out.println("length = " + b);
		System.out.println("area = " + (a * b));
//		System.out.println("area = "+c);
	}

}
