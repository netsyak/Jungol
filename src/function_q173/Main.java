package function_q173;

import java.util.Scanner;

public class Main {
	
	public int multi(int n1, int n2) { // 메서드 선언부/ 타입 부분 작성
		/*public int - 메서드이름 - (타입 변수 , 타입 변수)
		 return 0;
		
		*/
		int result = 0;
		if (n1 > n2) {
			result = (n1 * n1) - (n2 * n2);
		// return (n1 * n1) - (n2 * n2)  동일한 내용
		} else if (n2 > n1) {
			result = (n2 * n2) - (n1 * n1);
		// return (n2 * n2) - (n1 * n1)  동일한 내용
		}
		return result;// 동일한 내용으로 진행지 생략하기

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Main mm = new Main();
		int res = mm.multi(n1, n2);
		System.out.println(res);
	}

}
