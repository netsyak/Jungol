package q9030;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 System.out.println(num);
		if (num > 10) {
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		}
		sc.close();
	}

}
