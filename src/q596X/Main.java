package q596X;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

//		System.out.println(str+" "+num);
		for (int i = str.length()-1; num >= 0; i--, num--) {

			System.out.print(str.charAt(i));
		}

//		char word = str.charAt();

	}
}
