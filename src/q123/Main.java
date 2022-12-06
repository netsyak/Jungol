package q123;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Number? ");
		int num = sc.nextInt();
		for (;;) {
			if (num == 1) {
				System.out.print("dog");
			} else if (num == 2) {
				System.out.print("cat");
			} else if (num == 3) {
				System.out.print("chick");
			} else {
				System.out.print("I don't know.");
			}
			sc.close();
			break;
		}
	}
}