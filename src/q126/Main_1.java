package q126;

import java.util.Scanner;

// 입력 값 : 9 7 10 5 33 65 0
public class Main_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int odd = 0; // 홀수
		int even = 0; // 짝수
		for (;;) {
			int inp = sc.nextInt();
			// System.out.print(inp + " ");
			if (inp % 2 == 0 && inp !=0 ) {
				even++;
			} else if (inp % 2 != 0) {
				odd++;
			}
			if (inp == 0) {
				sc.close();
				break;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
