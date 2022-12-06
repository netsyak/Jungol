package q539X;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int sum = 0;
		//int s = 0;
		for (;;) {
			sum += s++;
			int sum1 = sum;
			if (sum1 >= 100) {
				sc.close();
				break;
			}
		}
		System.out.println(sum);
		System.out.printf("%.1f",(double)sum/s);
	}
}
