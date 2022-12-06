package function_q571;

import java.util.Scanner;

public class Main_tc {

	public static void printStr() {
		System.out.println("~!@#$^&*()_+|");
	}
 // 새로운 메서드 선원 부분
	public static void main(String[] args) {
		//11라인 - 메서드 시작 부분
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		sc.close();
		for (int i = 0; i < r; i++) {
			printStr(); // 새로운 메서드의 호출 부분
		}
	}
}
