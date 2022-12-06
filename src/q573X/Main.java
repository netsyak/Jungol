package q573X;

import java.util.Scanner;

public class Main {
	public void rectangle(int p) {// 새로운 일반 메서드
		int c = 1;
		// 사각형 모형 출력으로 2중 for 문 (for행.for열)
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				System.out.println(c++ + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println(n);
		Main m= new Main(); // 인스터스화 레퍼런스 이름
		m.rectangle(n);

	}
}
