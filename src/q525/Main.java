package q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		int result1;
		
		result = (a>b && a> c) ? 1: 0 ;
		result1 = (a==b && b==c) ? 1 : 0 ;
				sc.close();
				
		System.out.println(result+ " "+ result1);

	}
}
//
// int [] arr= new int[3];
// for ( int i=0;i< arr.lengh;i++) {
//	 arr[i] =sc.nextInt();
// }
// sc.close();
// 
// 
//
// }
