package q125;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = sc.nextInt();
		for (int i = 1; i <= inp; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
