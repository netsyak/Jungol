package function_q572;

import java.util.Scanner;

public class Main2 {
	
	public double area(int inp) {
		double result = inp * inp * 3.14;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		int inp = sc.nextInt();
		sc.close();
		
		Main2 r = new Main2();
		double res = r.area(inp);
		System.out.printf("%.2f", res);
	}
}
