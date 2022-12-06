package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (;;) {
			int inp = sc.nextInt();
			if (inp == 0) {
				break;
			}else if (inp % 3 != 0 && inp % 5 != 0) {
				count++;
			}
			System.out.print(count);
			sc.close();
			}
		}
	}

