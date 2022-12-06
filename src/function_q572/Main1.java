package function_q572;

import java.util.Scanner;

public class Main1 {
	public double area(int r) {
		double res =  r * r * 3.14;
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		Main1 m = new Main1();
		
		double ret = m.area(r);
		System.out.printf("%.2f",ret);
		
		
				
	}
}
