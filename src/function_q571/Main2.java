package function_q571;

import java.util.Scanner;

public class Main2 {
	
	public static void print() {
		System.out.print("~!@#$^&*()_+|");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 sc.close();
		 for(int i =0; i < num; i++) { 
			 print();
		 }
	}
	}
