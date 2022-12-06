package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println();
		
		int num1 =a++;
		int num2 =--b;
		int num3 =num1*num2;
		System.out.println(a+" "+num2+" "+num3);
				
	}

}
