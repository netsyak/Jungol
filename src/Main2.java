import java.util.Scanner;

public class Main2 {

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
		//int avg = sum / 3; //소수점까지 나타내려면 "(double)" 으로 변환시키기
		double avg = (double)sum / 3; //소수점까지 나타내려면 "(double)" 으로 변환시키기

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.printf("avg : %.3f\n", avg);
	}

}
