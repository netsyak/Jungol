package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		sc.close();
		
		
//		1. if~else if
//		if (x >= 4.0) {
//			System.out.println("scholarship");
//		}
//		else if (x >= 3.0) {
//			System.out.println("next semester");
//		}
//		else if (x >= 2.0) {
//			System.out.println("seasonal semester");
//		}
//		else {
//			System.out.println("retake");
//		}
		
		//2. switch ~ case
		
		switch ((int)x) {
		case 4 :
			System.out.println("scholarship");
			break;
		case 3 :
			System.out.println("next semester");
			break;
		case 2 :
			System.out.println("seasonal semester");
			break;
		default :
			System.out.println("retake");
		}	
	}
}
