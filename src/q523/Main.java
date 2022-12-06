package q523;

import java.util.Scanner;

//두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
//이때 입력받은 두 정수를 이용하여 출력하시오.
// (JAVA는 1이면 true, 0이면 false를 출력한다.)
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		// 스스로
		boolean a = (x > y);
		boolean b = (x < y);
		boolean c = (x >= y);
		boolean d = (x <= y);
		System.out.println(x + ">" + y + "---" + a);
		System.out.println(x + "<" + y + "---" + b);
		System.out.println(x + ">=" + y + "---" + c);
		System.out.println(x + "<=" + y + "---" + d);

//     2.		
//		if (x > y) {
//			System.out.println(x + ">" + y + "---" + 1);
//		} else
//			System.out.println(x + ">" + y + "---" + 0);
//
//		if (x < y) {
//			System.out.println(x + "<" + y + "---" + 1);
//		} else
//			System.out.println(x + "<" + y + "---" + 0);
//
//		if (x >= y) {
//			System.out.println(x + ">=" + y + "---" + 1);
//		} else
//			System.out.println(x + ">=" + y + "---" + 0);
//
//		if (x <= y) {
//			System.out.println(x + "<=" + y + "---" + 1);
//		} else
//			System.out.println(x + "<=" + y + "---" + 0);
//
//		System.out.println(x + ">" + y + "---" + (x > y));
//		System.out.println(x + "<" + y + "---" + (x < y));
//		System.out.println(x + ">=" + y + "---" + (x >= y));
//		System.out.println(x + "<=" + y + "---" + (x <= y));

		
		//1.
 System.out.print(x +">"+ y +"---");
	if(x>y)
		System.out.println(1);
	}else {
		System.out.println(0);}
   }




