package q9036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("1. 삽입\n2. 수정\n3. 삭제\n숫자를 선택하세요. ");
		int inp = sc.nextInt();

		switch (inp) {

		case 1:
			System.out.print("삽입을 선택하셨습니다.");
			break;
		case 2:
			System.out.print("수정을 선택하셨습니다.");
			break;
		case 3:
			System.out.print("삭제을 선택하셨습니다.");
			break;
		}
		sc.close();
	}
}
