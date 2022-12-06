package q537;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int x = 0, y = 1;
		while (y <= a) {
			x += y++;
		}
		sc.close();
		System.out.println(x);
	}

}
