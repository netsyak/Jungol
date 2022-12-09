package q543;
// 문제 : 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		
//		방법 1.
//		for (int i = 1; i <= num; i++ ) {
//			if(i*2 <=num)
//				
//			System.out.print(i*2+" ");
//		}
//		sc.close();
//	}
//
//}
//		방법 2.
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
