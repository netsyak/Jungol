package q557X;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char x[] = new char[10];

		for (int i = 0; i < x.length; i++) {
			// String s = sc next();
			// x[] = s.charAt(0);
			x[i] = sc.next().charAt(0);
			}
		     sc.close();
			 System.out.println(x[0] + " " + x[3] + " " + x[6]);
		
		// for(int i=0; i <x.length;i++) {
		// System.out.print(x[i]+" ");

	//	System.out.println(x[0] + " " + x[3] + " " + x[6]);
	}
}
