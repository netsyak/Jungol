package function_q572;

import java.util.Scanner;

public class Main {
	public double area(int r) {

		double a = (r * r * 3.14);
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

		Main m = new Main();
		double rr = m.area(r);
		System.out.printf("%.2f", rr);
	}
}
