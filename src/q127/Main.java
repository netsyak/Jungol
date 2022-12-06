package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int count = 0;
		while (true) {
			num = sc.nextInt();
			if (num >= 0 && num <= 100) {
				sum += num;
				count++;
			} else {
				System.out.println("sum : " + sum);
				System.out.printf("avg : %.1f\n", (double) sum / count);
			}
			break;
		}
		sc.close();
	}
}
