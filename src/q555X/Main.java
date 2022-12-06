package q555X;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = new char[10];

		for (int i = 0; 1 < s.length; i++) {
			s[i] = sc.next().charAt(0);
			// char s = sc.next().charAt(0);
			//s[i] = s;
			System.out.printf("%c", s[i]);
		}
		sc.close();
		
		//for (int i=0;i<10;i++) {
			//System.out.println(s[i]);
		}
	
}

