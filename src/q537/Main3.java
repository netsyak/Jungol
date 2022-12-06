package q537;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 0, b = 1;
		while (b <= x) {
			a += b++;
		}
		System.out.println(a);
		sc.close();
	}
}
