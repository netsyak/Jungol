import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); String x = scanner.nextLine();
		 * String y = scanner.nextLine(); String z = scanner.nextLine();
		 * scanner.close();
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		// System.out.println(num1);
		// System.out.println(num2);
		// System.out.println(num3);

		int sum = num1 + num2 + num3;
		int avg = sum / 3;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
	
}