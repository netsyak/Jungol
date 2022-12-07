package q575;

import java.util.Scanner;


public class Main {
	
	int inp1;
	int inp2;
	
	double x = Math.pow(inp1,inp2);  
	result = x;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		
		System.out.println((int)x);

	}
}