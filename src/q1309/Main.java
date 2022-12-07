package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
//		int result = factorial(n);
////		System.out.println(result);
//	}
//
//	static int factorial(int n) {
//		int result = 0;
//		if(n== 1)
//			result = 1;
//			System.out.printf("1! = 1\n");
//		else
//			result =n*factorial(n-1); 
//			System.out.printf("%d! = %d * %d!",n,n,(n-1));
//
//			System.out.println(result);
//			return result;
//	}

	
		int sum = 1;
		for (int i= n; i<=1 ;i--) {
		System.out.printf("%d! = %d * %d\n%d",i,i,j,sum );	
			sum *=i;
			for (int j=1; j<=n-1 ; j++) {
			}
		sc.close();
		}
		System.out.println(sum);	
			

