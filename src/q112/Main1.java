package q112;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
				
		int res1 = n1/n2; 
		int res2 = n1%n2;
		sc.close();
		System.out.println(n1+" / "+ n2 +" = "+res1+"..."+res2);
	}
}
