package q9035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		System.out.print("세 수를 입력하세요. ");
		
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max > arr[i]) {
				max = arr[i];
				System.out.print(max);

			}

		}
		sc.close();

	}
}