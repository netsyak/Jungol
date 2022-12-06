package q124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[12];
		for (int i = 0; i < arr.length;) {
			arr[i] = sc.nextInt();
			if (arr[i] == 2) {
				System.out.println("28");
			} else if (arr[i] % 2 == 1 && arr[i] < 8) {
				System.out.println("31");
			} else if (arr[i] % 2 == 0 && arr[i] >= 8) {
				System.out.println("31");
			} else {
				System.out.println("30");
			}
			break;
		}
		sc.close();
	}
}
