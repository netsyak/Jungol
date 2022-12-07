package q632x;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		//		if (a > b) {     내가한것
		//		} else if (b > c)
		//			System.out.println(c);
		//		if (b > c) {
		//		} else if (c > a)
		//			System.out.println(a);
		//		if (c > a) {
		//		} else if (a > b) 
		//			System.out.println(b);

		//		if (a > b) {     
		//  		   if (b > c) {
		//  		  	System.out.println(c);
		//		} else {
		//			System.out.println(b);
		//		}
		//		}else {
		//			if (a > c) {
		//				System.out.println(c);
		//			}else {
		//				System.out.println(a);
		//	
		//	  int min = (num1 > num2)?((num2 > num3) ? num3 : num2);(num1> num3)? num3 : num1);
		//			

		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		System.out.println(min);
	}

}
