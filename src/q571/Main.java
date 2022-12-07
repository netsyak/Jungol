package q571;

import java.util.Scanner;

public class Main {
	public static void printstr() {
		System.out.println("~!@#$^&*()_+|");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		for(int i =0; i< inp ; i++) { 
			printstr();
		}
		sc.close();
	}
}
