package q9051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
		}
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				count++;
			}
		}
		System.out.printf("입력받은 짝수는 %d개입니다.", count);
		sc.close();
	}
}
