package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
		if (s == 'M') {
		} else if (age >= 18) {
			System.out.println("MAN");
		} else {
			System.out.println("BOY");
		}
		if (s == 'F') {
		} else if (age >= 18) {
			System.out.println("WOMAN");
		} else {
			System.out.println("GIRL");
		}
	}
}
