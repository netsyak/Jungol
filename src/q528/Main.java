package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		//		System.out.println(num);   
		//		System.out.println(num);

		if (num < 0) {
			System.out.println(num);
			System.out.println("minus");
		} else {
			System.out.println(num);

		}
	}
}
