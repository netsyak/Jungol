package function_q171;

import java.util.Scanner;

public class Main_T {

	public int allSum(int p) {// p =inp;  
		int sum = 0;
		for(int i = 1 ; i <=p ; i++) {
			sum += i;
       	}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		Main_T m = new Main_T();
		int ret = m.allSum(inp);
			
		System.out.println(ret);	
		
		
	}
}
