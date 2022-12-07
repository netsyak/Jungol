package q9041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("점수를 입력하세요. ");
			int score = sc.nextInt();
			if (score >= 80 && score <= 100) {
				System.out.println("축하합니다. 합격입니다.");
			} else if (score < 80 && score > 0) {
				System.out.println("죄송합니다. 불합격입니다.");
			} else {
				sc.close();
				break;
			}

		} while (true);
	}
}
