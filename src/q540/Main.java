package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int inp;
//		for (;;) {
//			inp = sc.nextInt();
//			if (inp%3 == 0) {
//				System.out.println(inp / 3);
//			} else if (inp%3> 0) {
//				System.out.print("");
//			} else if (inp == -1) {
//				sc.close();  // break 직전에 넣어주기
//				break;
//			}
//		}
//	}
//}
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			int inp = sc.nextInt();

			if (inp == -1) {
				sc.close();
				break;
			} else if (inp % 3 == 0) {
				int ret = inp / 3;
				System.out.println(ret);
			} else if (inp % 3 != 0) {
			}
		}
	}
}
