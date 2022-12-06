package q561_maxmin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = -1;
		int min = 10000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max && arr[i] < 100) {
				max = arr[i];
			}
			if (arr[i] < min && arr[i] >= 100) {
				min = arr[i];
			}
		}

		if (max == -1) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}

		System.out.print(max + " " + min);
		sc.close();
	}
}