package q541;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();

		// 방법 1
//		for (int i = 0; i < 20; i++) {
//		System.out.print(ch);

		// 방법 2
//		int i = 0;
//		while (i < 20) {
//			System.out.print(ch);
//			i++;

		// 방법 3
		int i = 0;
		do {
			System.out.print(ch);
			i++;
		}
		while (i < 20);

	}
}
