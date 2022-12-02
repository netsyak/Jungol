package q534;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();

		switch (c) {  //필히 switch타입과  case 의 타입이 동일 해야한다.
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;
		default:// 위 문자열에 해당하지 않을 경우의 결과값 만들기
			System.out.println("error");

		}

	}

}
