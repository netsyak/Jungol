package function_q172X;

import java.util.Scanner;

public class Main {
	static void result(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j * i <= i * num; j++) {

				System.out.print(i*j  + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		result(num);

	}

}
