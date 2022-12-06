package q113;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		int width = n1+5;
		int length =n2*2;
		int area = width*length;
		
		System.out.println("width = "+width);
		System.out.println("length = "+length);
		System.out.println("area = "+area);
		sc.close();
		
	}

}
