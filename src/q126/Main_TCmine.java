package q126;

import java.util.Scanner;

public class Main_TCmine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int i = 0;
		boolean b = true;
		do {
			inp[i] = sc.nextInt();
			if (inp[i] == 0) {
				b = false;
			}
			i++;
		} while (b);
		sc.close();
		
		// 위부분 선생님 아래는 내가
		
		int even = 0;
		int odd = 0;
		
		for (int j = 0; j < i; j++) {
		//	System.out.print(inp[j] + " ");
			if (inp[j] % 2 == 0 && inp[j] !=0) {
				even++;
			} else if (inp[j] % 2 != 0 ) {
				odd++;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
