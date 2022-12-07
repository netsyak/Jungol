package q1309;

import java.util.Scanner;

public class Main_T {
	public static int factorial(int p) {
		if (p==1) {
			System.out.println(p +"! =" + p);
			return 1;
		}else {
			System.out.println("*"+ (p-1)+"!");
			return p *factorial(p-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(n);
		
		int ret= factorial(n);
		
		System.out.print();
	}

}
