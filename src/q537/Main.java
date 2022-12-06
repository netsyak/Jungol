package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		// System.out.println(inp); 테스트 구간

		// 1.for loop
		//		for (int i = 1; 1 <= inp; i++) {
		//			sum += i; // sum = sum + i;
		//		}
		//		System.out.println(sum); //윗 "{ }" 안 넣었다면 +1 증가 떄마다 출력하게됨

		// 2. while loop
		int a = 0, b = 1;
		while (b <= x) {
			a += b++;
		}
		System.out.print(a);

		// 3. Do-while loop

		//		int sum2 = 0, k = 1;
		//		do {
		//			sum2 += k++;
		//		} while (k <= inp);
		//		System.out.println(sum2);

	}
}
