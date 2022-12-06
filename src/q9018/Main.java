package q9018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 수를 입력하시오. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+n1*n2);
		System.out.println(n1+" / "+n2+" = "+n1/n2);
		System.out.println(n1+" % "+n2+" = "+n1%n2);
		sc.close();
	}

}
