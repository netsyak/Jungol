package function_q572;

import java.util.Scanner;

public class Main_TC {
	public double calcArea(int r) {
		double area = r * r * 3.14;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

//		System.out.println(r);
		Main_TC m = new Main_TC();
		double ret = m.calcArea(r);
		System.out.printf("%.2f\n", ret);
	}
}