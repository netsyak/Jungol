package q562;

import java.util.Scanner;

public class Main_tc_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum1 = 0, sum2 = 0;
		for (int i = 0; 1 < 100; i++) {
			if (i % 2 == 0) {
				sum1 += sc.nextInt();
			} else {
				sum2 += sc.nextInt();
			}
			
		System.out.println("sum : " + sum2);
		System.out.printf("avg : %.2f\n", (double) sum1 / 5);
		sc.close();
		}
	}
}
